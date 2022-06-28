package io.leetCode.solutions.hackerrank.algo.warmup;

import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers, calculate the ratios of its elements that are positive,
 * negative, and zero. Print the decimal value of each fraction on a new line with  places
 * after the decimal.
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal
 * places, though answers with absolute error of up to  are acceptable.
 */
@Slf4j
public class PlusMinus {

    public void plusMinusMethod(List<Integer> arr) {
        // Write your code here
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        int listSize = arr.size();

        List<Integer> list = new ArrayList<>();

        double positiveElements = arr.stream().filter(x -> x > 0).count();
        double negativeElements = arr.stream().filter(x -> x < 0).count();
        double zeroElements = arr.stream().filter(x -> x == 0).count();

        System.out.println(Double.valueOf(df.format((positiveElements / listSize))));
        System.out.println(Double.valueOf(df.format((negativeElements / listSize))));
        System.out.println(Double.valueOf(df.format((zeroElements / listSize))));
        int sum;
        int numCore;

    }

}
