package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array of Primitives
//        int[] arr = new int[4];
//        arr[0] = 24;
//        arr[1] = 346;
//        arr[2] = 213;
//        arr[3] = 14;
        //[24, 346, 213, 14]

        //System.out.println(arr[3]);
        //this is not effective way

        //input using for loop

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println(Arrays.toString(arr));



         // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str [1] = "ayush";

        System.out.println(Arrays.toString(str));
    }
}
