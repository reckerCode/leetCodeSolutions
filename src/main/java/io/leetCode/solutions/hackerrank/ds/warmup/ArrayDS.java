package io.leetCode.solutions.hackerrank.ds.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * return reversed list
 */
public class ArrayDS {

    List<Integer> integerList = Arrays.asList(2,4,3,1);

    public ArrayDS() {
        reverseListMethod(integerList);
    }

    public void reverseListMethod(List<Integer> n){
        List<Integer> reversedList = new ArrayList<>();

        for(int i = n.size()-1; i >= 0; i --){
            reversedList.add(n.get(i));
        }
        System.out.println(reversedList);
    }
}
