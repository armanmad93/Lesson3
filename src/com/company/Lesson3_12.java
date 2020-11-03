package com.company;

import java.util.Scanner;

public class Lesson3_12 {

    public static void main(String[] args) {

        //Write a program to display the first n Fibonacci series.
        //(Fibonacci series 0 1 1 2 3 5 8 13 .....)
        //Test Data :
        //Input number of terms to display: 10
        //Expected Output :
        //Here is the Fibonacci series up to to 10 terms :
        //0 1 1 2 3 5 8 13 21 34

        Scanner scanner = new Scanner(System.in);

        System.out.print("plz input number: ");
        int userNumber = scanner.nextInt();

        int firstBox = 0;
        int secondBox = 1;
        int sum;

        System.out.print(firstBox + ", ");
        System.out.print(secondBox + ", ");

        for (int i = 1; i < userNumber - 1; i++) {

            sum = firstBox + secondBox;
            System.out.print(sum + ", ");
            firstBox = secondBox;
            secondBox = sum;

        }
    }
}
