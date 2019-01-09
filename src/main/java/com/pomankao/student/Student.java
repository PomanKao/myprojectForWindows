package com.pomankao.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
//        int max = english > math ? english : math;
//        if (english > math) {
//            max = english;
//        } else {
//            max = math;
//        }
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.print(name + "\t" + english+ "\t" + math+ "\t"
                + getAverage() + "\t");
        if (getAverage() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
