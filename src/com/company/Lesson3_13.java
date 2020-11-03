package com.company;

import java.util.Scanner;

public class Lesson3_13 {

    public static void main(String[] args) {

        //Input an integer n. Print checkerboard pattern with n rows and n columns with the words black and white
        //Sample input: Input number of rows and columns: 5
        //Sample Output:
        //black-white-black-white-black
        //white-black-white-black-white
        //black-white-black-white-black
        //white-black-white-black-white
        //Black-white-black-white-black

        Scanner scanner = new Scanner(System.in);

        System.out.println("plz input number: ");
        int userNumber = scanner.nextInt();

        boolean answer = true;

        for (int i = 0; i < userNumber; i++) {

            if (answer) {
                System.out.println("black-white-black-white-black");
                answer = false;
            } else {
                System.out.println("white-black-white-black-white");
                answer = true;
            }

        }

    }
}
