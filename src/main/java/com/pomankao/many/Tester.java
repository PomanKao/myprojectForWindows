package com.pomankao.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
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

//        arrayTest();
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
