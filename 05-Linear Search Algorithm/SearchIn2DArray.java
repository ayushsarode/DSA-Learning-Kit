package com.ayush;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {4, 25, 2},
                {35, 63, 58, 28},
                {46, 88, 36,12},
                {74, 15}

        };
        int target = 88;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};

                }
            }
        }
        return new int[]{-1, -1};
    }
    
}
