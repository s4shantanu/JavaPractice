package com.shantanu;

import java.util.Scanner;

public class Scannerinput {
    public static void main(String[] args) {
        System.out.println("Enter Name here :");
        Scanner input = new Scanner(System.in);             //For getting input from end user.
        String name = input.nextLine();
        System.out.println("Enter Roll number :");
        int rollno = input.nextInt();
        System.out.println("Hello " + name + " Your Roll number is " + rollno);
    }
}