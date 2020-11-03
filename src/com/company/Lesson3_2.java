package com.company;

public class Lesson3_2 {

    public static void main(String[] args) {

        //Write a program to display the first 20 natural numbers but exclude the ones that are divisible by 3. (using continue)

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
