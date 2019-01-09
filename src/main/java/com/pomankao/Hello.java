package com.pomankao;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        String s = "abcde";
        String s = null;
        System.out.println(s.charAt(3));
        System.out.println(s.length());
       Person person = new Person(66.5f, 1.7f);
        person.hello();

        int score = 88;
        System.out.println(score < 80 || score > 90); // false
        char c = 'A'; // ASCII: 65
        System.out.println(c > 'a'); // false
        System.out.print("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number > 60);
    }
}