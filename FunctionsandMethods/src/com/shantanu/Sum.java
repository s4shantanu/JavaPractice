//Sum of two numbers ------------>
package com.shantanu;

import java.util.Scanner;

public class Sum  {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 1st number : ");
//        int num1 = input.nextInt();
//        System.out.println("Enter 2nd number : ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum of two numbwe is : "+ sum);
//        sum();
        int a = sum(2,4);
        System.out.println(a);
    }
//    static void sum() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter 1st number : ");
//        int num1 = input.nextInt();
//        System.out.println("Enter 2nd number : ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum of two numbwe is : " + sum);
//    }
    static int sum(int a,int b){
        int ans = a + b;
        return ans;

    }
}
