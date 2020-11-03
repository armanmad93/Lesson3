package com.company;

public class Lesson3_3 {

    public static void main(String[] args) {

        //Write a program to print the even numbers in range {-20, +60}

        for (int i = -20; i <= 60; i += 2) {
            System.out.println("even numbers(version 1): " + i);
        }

        System.out.println();

        //version 2

        for (int i = -20; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.println("even numbers(version 2): " + i);
            }
        }
    }
}
