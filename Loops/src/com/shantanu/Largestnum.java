//Find largest number
package com.shantanu;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number - ");
        int a = input.nextInt();
        System.out.println("Enter 2st number - ");
        int b = input.nextInt();
        System.out.println("Enter 3st number - ");
        int c = input.nextInt();
//        int max = a;
//        if(b>max){
//            max = b;
//        }
//        if (c>max) {
//            max = c;
//        }
//            System.out.println(max);
        int max = 0;
        if(a>b){
            max=a;
        }
        else{
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

    }
}
