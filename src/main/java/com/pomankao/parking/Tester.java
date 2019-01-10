package com.pomankao.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2018,12,25,8,0,0);
        LocalDateTime leave = LocalDateTime.of(2018,12,25,10,8,0);
        Car car = new Car("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);
        System.out.println(30*hours);
        // Java8
//        java8Instant();
//        javaDateAndCalendar();
    }

    private static void java8Instant() {
        Instant instant = Instant.now();
        System.out.println(instant);
        // Local
        LocalDateTime localNow = LocalDateTime.now();
        System.out.println(localNow);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(localNow));
        System.out.println(localNow.plus(Duration.ofHours(3)));
        LocalDateTime other =
                LocalDateTime.of(2018,11,23,8,0,0);
        System.out.println(other);
    }

    private static void javaDateAndCalendar() {
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
