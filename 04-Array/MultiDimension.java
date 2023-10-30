package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // 2D
        /*
             1 2 3
             4 5 6
             7 8 9
         */

        // int[][] arr = new int[3][]; //number of rows are mandatory here int[3] is row

        Scanner in = new Scanner(System.in);

//        int[][] arr2D = {
//                {1, 2, 3}, // 0th index
//                {4, 5, 6}, //1st index
//                {7, 8, 9, 2 ,6} //2nd index -> arr2D[2][0], output: 7
//        };


        // System.out.println(arr2D.length); //no. of rows

        int[][] arr = new int[3][3];

// Input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

//// Output in a 3x3 matrix form
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // Move to the next row
//        }


//replacing it with Arrays.toString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}
