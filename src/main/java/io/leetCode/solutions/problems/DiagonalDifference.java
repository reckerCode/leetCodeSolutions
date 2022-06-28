package io.leetCode.solutions.problems;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DiagonalDifference {
    public int diagonalDifferenceSolution(List<List<Integer>> integerList) {
        int leftDiagonal = integerList.stream()
                .map(i -> i.get(integerList.indexOf(i)))
                .collect(Collectors.toList())
                .stream()
                .reduce(0, Integer::sum);

        int rightDiagonal = integerList.stream()
                .map(i -> i.get((integerList.size() - 1) - integerList.indexOf(i)))
                .collect(Collectors.toList())
                .stream()
                .reduce(0, Integer::sum);

        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
