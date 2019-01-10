package com.pomankao.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));;
        System.out.println(stocks);
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
//        setTest();
//        listTest();
//        arrayTest();
    }

    private static void setTest() {
        // Set
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(6);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(7);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void listTest() {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(3);
        list.add("abc");
        list.add(true);
        System.out.println(list);
        int number = (int) list.get(0);
        String abc = (String) list.get(2);
//        String s = (String) list.get(1); // ClassCastException
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(5);
        intList.add(3);
        intList.add(1);
        intList.add(7);
        System.out.println(intList);
        int n1 = intList.get(0);
        int n2 = intList.get(1);
        System.out.println(intList.size());
        List<Integer> scores = Arrays.asList(68, 88, 77, 99, 50);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[4] = 3;
//        numbers[5] = 8; // ArrayIndexOutOfBoundsException
        int[] scores = {68, 88, 77, 99, 50};
        System.out.println(scores); // print the memory location of scores
        for (int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }
        for (int n : scores) {
            System.out.println(n);
        }
    }
}
