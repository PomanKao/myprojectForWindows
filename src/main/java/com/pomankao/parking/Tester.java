package com.pomankao.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String testDateStr = "2019/05/01 08:00:00";
        Date testDate = null;
        try {
            testDate = sdf.parse(testDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(testDate);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }

}
