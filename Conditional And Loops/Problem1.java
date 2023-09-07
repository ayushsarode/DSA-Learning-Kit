package com.Ayush;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


//        METHOD 1


//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        // Q Find the Largest Number out of three
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println(max);


        // METHOD 2


        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
   }


}
