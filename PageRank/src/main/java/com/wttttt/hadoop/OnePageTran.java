package com.wttttt.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.chain.ChainMapper;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: wttttt
 * Github: https://github.com/wttttt-wang
 * Date: 2017-04-20
 * Time: 11:08
 */
public class OnePageTran {

    public static class TransitionMapper extends Mapper<LongWritable, Text, Text, Text>{

        /**
         * Called once for each key/value pair in the input split. Most applications
         * should override this, but the default is the identity function.
         *
         * @param key -->
         * @param value --> pageIndA\tpage1,page2,….pageN
         * output: key --> pageIndA    value --> page1,page2,...pageN=1/N
         */
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            String[] line = value.toString().trim().split("\t");
            if (line.length == 1 || line[1].trim().equals("")) return;

            String[] pages = line[1].trim().split(",");

            if (pages.length < 1) return;    // return if pageIndA has no out links
            context.write(new Text(line[0]), new Text(line[1] + "=" + 1.0 / pages.length));
        }
    }


    public static class PrMapper extends Mapper<LongWritable, Text, Text, Text>{
        /**
         * @param key -->
         * @param value --> pageIndex\tpr0
         * output: key --> pageIndex   value --> pr0
         */
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            String[] line = value.toString().trim().split("\t");
            context.write(new Text(line[0]), new Text(line[1]));
        }
    }


    public static class MultiplicationReducer extends Reducer<Text, Text, Text, Text>{
        /**
         * @param key --> pageIndA
         * @param values  --> page1,page2...pageN=1/N    or pr0
         * output: key --> pageIndA   value --> pagei=(1/N*pr0(A))
         */
        @Override
        protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
            double prA = 0;
            ArrayList<String> transition = new ArrayList<String>();
            double transitionPro = 0;
            for(Text val : values) {
                String value = val.toString().trim();
                if (value.contains("=")){
                    String pages = value.split("=")[0];
                    transitionPro = Double.parseDouble(value.split("=")[1]);
                    for (String page : pages.split(",")){
                        transition.add(page);
                    }
                } else{
                    prA = Double.parseDouble(value);
                }
            }
            for (String page : transition) {
                context.write(new Text(key), new Text(page + "=" + transitionPro * prA));
            }
        }
    }


    public static void main(String[] args) throws Exception{
        if (args.length < 3) {
            System.err.println("Usage: OnePageTran <inputTransitionDir> <inputPrDir> <outDir>");
            System.exit(2);
        }
        String inputTransitionDir = args[0];
        String inputPrDir = args[1];
        String outputDir = args[2];

        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "OnePageTran");
        job.setJarByClass(OnePageTran.class);

        MultipleInputs.addInputPath(job, new Path(inputTransitionDir), TextInputFormat.class,
                TransitionMapper.class);
        MultipleInputs.addInputPath(job, new Path(inputPrDir), TextInputFormat.class,
                PrMapper.class);
        // no combiner available
        job.setReducerClass(MultiplicationReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        FileOutputFormat.setOutputPath(job, new Path(outputDir));

        job.waitForCompletion(true);
    }



}
