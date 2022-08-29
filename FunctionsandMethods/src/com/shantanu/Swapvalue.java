//Swipe two numbers
package com.shantanu;

public class Swapvalue {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
//        int temp = a;
//        a=b;
//        b = temp;
//        System.out.println(a+" "+ b);

        swap(a,b);
        System.out.println(a +" "+ b);


    }
    static void swap(int a,int b){
        int temp = a;
        a=b;
        b = temp;
    }
}
