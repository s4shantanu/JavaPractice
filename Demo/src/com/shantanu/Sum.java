package com.shantanu;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = input.nextInt();
        System.out.println("Enter second number : ");
        int b = input.nextInt();
        int c = a+b;
        System.out.println("Sum of two number is : " + c);
//        System.out.println(a*b);
    }
}
