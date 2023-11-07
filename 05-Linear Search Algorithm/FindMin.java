package com.ayush;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {25, 63, 6, 26, 67, 42, 14};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

}
