package com.wttttt.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: wttttt
 * Github: https://github.com/wttttt-wang/hadoop_inaction
 * Date: 2017-04-20
 * Time: 15:59
 */
public class Driver {

    public static void main(String[] args) throws Exception{
        if (args.length < 4) {
            System.err.println("Usage: Driver <inputTransitionDir> <inputPrDir> <outStateDir> <iterateNum> <alpha>");
            System.exit(2);
        }

        String transitionMatrix = args[0];
        String prMatrix = args[1];
        String midState = args[2];
        int iterateNum = Integer.parseInt(args[3]);


        // Iteration here
        for (int i = 0; i < iterateNum; i++) {
            String[] args0 = {transitionMatrix, prMatrix + i, midState + i};
            OnePageTran.main(args0);
            String[] args1 = {midState + i, prMatrix + (i + 1), args[4], prMatrix + i};
            SumPr.main(args1);
        }

    }
}
