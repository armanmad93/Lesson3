package com.company;

import java.util.Scanner;

public class Lesson3_10 {

    public static void main(String[] args) {

        //Write a program to display the multiplication table of a given integer
        //Test Data :
        //Input the number (Table to be calculated): 15
        //Expected Output :
        //15 X 1 = 15
        //...
        //...
        //15 X 10 = 150

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input number: ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(userNumber + " X " + i + " = " + (userNumber * i));

        }

    }
}
