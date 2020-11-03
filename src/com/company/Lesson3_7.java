package com.company;

public class Lesson3_7 {

    public static void main(String[] args) {

        //Write a program to find the average of even numbers of the first 100 natural numbers.

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("the average of even numbers of the first 100 natural numbers is: " + (sum / count));
    }
}
