package com.company;

import java.util.Scanner;

public class Lesson3_8 {

    public static void main(String[] args) {

        //Write a program to read 10 numbers from the keyboard (console) and find their sum and averag

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("plz input " + i + " number: ");
            int userNumber = scanner.nextInt();
            sum += userNumber;

        }

        System.out.println("sum of 10 numbers from the keyboard is: " + sum);
        System.out.println("averag of 10 numbers from the keyboard is: " + (sum / 10));

    }
}
