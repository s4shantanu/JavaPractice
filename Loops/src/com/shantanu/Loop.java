package com.shantanu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for(int num = 1; num<=5; num+=1) {
//            System.out.println(num);
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
//        for(int i = 1; i<=num; i++){
//            System.out.println(i);
//        }
//        while(num<=5) {
//            System.out.println("Hello World");
//            num++;
//        }
        do{
            System.out.println("Hello World!");
        }while(num!=1);
    }
}
