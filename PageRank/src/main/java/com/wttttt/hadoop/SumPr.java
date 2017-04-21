package com.wttttt.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: wttttt
 * Github: https://github.com/wttttt-wang/hadoop_inaction
 * Date: 2017-04-20
 * Time: 15:23
 */
public class SumPr {

    public static class SimpleMapper extends Mapper<LongWritable, Text, Text, DoubleWritable>{
        double alpha;
        @Override
        protected void setup(Context context) throws IOException, InterruptedException {
            alpha = context.getConfiguration().getDouble("alpha", 0.2);
        }

        /**
         * @param key  -->
         * @param value --> pageInA\tpagei=val
         * output: key --> pagei   value --> val
         */
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            String[] line = value.toString().trim().split("\t");
            if (line.length <= 1) return;

            String[] target = line[1].split("=");
            if (target.length <= 1) return;

            context.write(new Text(target[0]), new DoubleWritable(Double.parseDouble(target[1]) * (1 - alpha)));

        }
    }

    // To handling edge cases, for convergence.
    public static class RandomLinkMapper extends Mapper<LongWritable, Text, Text, DoubleWritable>{
        private double alpha;
        /**
         * Called once at the beginning of the task.
         */
        @Override
        protected void setup(Context context) throws IOException, InterruptedException {
            alpha = context.getConfiguration().getDouble("alpha", 0.2);
        }

        /**
         * @param key -->
         * @param value --> pageIndex\tpr0
         * output: key --> pageIndex   value --> pr0*alpha
         */
        @Override
        protected void map(LongWritable key, Text value, Mapper.Context context) throws IOException, InterruptedException {
            String[] line = value.toString().trim().split("\t");
            if (line.length < 2) return;
            context.write(new Text(line[0]),new DoubleWritable(Double.parseDouble(line[1]) * alpha));
        }

    }

    public static class SumReducer extends Reducer<Text, DoubleWritable, Text, DoubleWritable>{

        /**
         * Description: count
         * @param key --> page
         * @param values --> val
         * output: key --> page, value --> count(val)
         */
        @Override
        protected void reduce(Text key, Iterable<DoubleWritable> values, Context context) throws IOException, InterruptedException {
            double sum = 0;
            for (DoubleWritable val : values){
                sum += val.get();
            }
            context.write(key, new DoubleWritable(sum));
        }
    }

    public static void main(String[] args) throws Exception{
        if (args.length < 4) {
            System.err.println("Usage: SumPr <inDir> <outDir> <alpha> <inputPrDir>");
            System.exit(2);
        }

        Configuration conf = new Configuration();
        conf.setDouble("alpha", Double.parseDouble(args[2]));

        Job job = Job.getInstance(conf);
        job.setJarByClass(SumPr.class);
        //job.setMapperClass(SimpleMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class, SimpleMapper.class);
        MultipleInputs.addInputPath(job, new Path(args[3]), TextInputFormat.class, RandomLinkMapper.class);

        job.setReducerClass(SumReducer.class);
        job.setCombinerClass(SumReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(DoubleWritable.class);
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        job.waitForCompletion(true);
    }

}
