package com.company;

import java.util.Scanner;

public class Lesson3_11 {

    public static void main(String[] args) {

        //Write a program to determine whether a given number is prime or not.
        //Test Data :
        //Input a number: 13
        //Expected Output :
        //13 is a prime number.

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input number: ");
        int userNumber = scanner.nextInt();

        boolean answer = true;

        for (int i = 2; i < userNumber; i++) {
            if (userNumber % i == 0) {
                System.out.println(userNumber + " is not a prime number.");
                answer = false;
                break;
            }
        }
        if (answer) {
            System.out.println(userNumber + " is a prime number.");
        }

    }
}
