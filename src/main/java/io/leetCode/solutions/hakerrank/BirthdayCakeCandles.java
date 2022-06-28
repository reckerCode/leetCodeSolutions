package io.leetCode.solutions.hakerrank;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int result = 0;
        int max = Collections.max(candles);
        result = (int) candles.stream().filter(x->x==max).count();
        return result;

    }
}
