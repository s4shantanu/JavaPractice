//Fibonacci number
package com.shantanu;

import java.util.Scanner;

public class Fibnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number here - ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        while(c<=num){
            int temp = b;
            b = b+a;
            a = temp;
            c++;
        }
        System.out.println(b);
    }
}
