package io.leetCode.solutions.hakerrank;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class MinMaxSum {
    public void miniMaxSumMethod(List<Integer> arr) {
        // Write your code here
        int aceSum = 0;
        int decSum = 0;
        int count = 0;

        List<Integer> aceList = arr.stream()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> decList = arr.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (Integer i : aceList) {
            if (count < 4) {
                aceSum += i;
                decSum += decList.get(count);
                count++;
            }
        }

        System.out.println(aceSum);
        System.out.println(decSum);
    }

}
