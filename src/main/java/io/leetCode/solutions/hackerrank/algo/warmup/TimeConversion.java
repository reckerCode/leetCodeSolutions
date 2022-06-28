package io.leetCode.solutions.hackerrank.algo.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;

public class TimeConversion {
    public static String timeConversion(String s) {
        String resultTime = " ";
        DateFormat timeFormat12 = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat timeFormat24 = new SimpleDateFormat("HH:mm:ss");

        Date date = null;
        try {
            date = timeFormat12.parse(s);

        } catch (DateTimeException | ParseException e) {
            e.printStackTrace();
        }
        if (date != null) {
            resultTime = timeFormat24.format(date);
        }
        return resultTime;
    }
}
