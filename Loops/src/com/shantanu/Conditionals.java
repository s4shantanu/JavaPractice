package com.shantanu;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.println("Enter your salary : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number>20000) {
            System.out.println("You are eligible for lone");
        }
        else{
            System.out.println("Please try neext time");
        }

    }
}
