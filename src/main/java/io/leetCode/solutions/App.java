package io.leetCode.solutions;

import io.leetCode.solutions.hackerrank.algo.warmup.BirthdayCakeCandles;
import io.leetCode.solutions.hackerrank.algo.warmup.MinMaxSum;
import io.leetCode.solutions.hackerrank.algo.warmup.PlusMinus;
import io.leetCode.solutions.problems.DiagonalDifference;
import io.leetCode.solutions.problems.EditDistanceSolution;
import io.leetCode.solutions.problems.SimplifyPathSolution;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Slf4j
public class App implements CommandLineRunner {

    SimplifyPathSolution solution = new SimplifyPathSolution();
    EditDistanceSolution distanceSolution = new EditDistanceSolution();
    DiagonalDifference diagonalDifference = new DiagonalDifference();
    PlusMinus plusMinus = new PlusMinus();
    MinMaxSum minMaxSum = new MinMaxSum();
    BirthdayCakeCandles cakeCandles = new BirthdayCakeCandles();

    List<List<Integer>> integerList = Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12));

    List<Integer> arr = Arrays.asList(-4, 3, -9, 0, 4, 1);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //        solution.simplifyPath("/home/");
        //        distanceSolution.minDistance("intention", "execution");
//        log.info("{}", diagonalDifference.diagonalDifferenceSolution(integerList));
//        plusMinus.plusMinusMethod(arr);
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        minMaxSum.miniMaxSumMethod(list);
        cakeCandles.birthdayCakeCandles(arr);
    }
}
