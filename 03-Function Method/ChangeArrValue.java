package com.ayush;

import java.util.Arrays;

public class ChangeArrValue {
    public static void main(String[] args) {
        // Declare an integer array named 'arr' and initialize it with values.
        int[] arr = {3, 5, 2, 6, 67};

        // Call the 'change' method, passing the 'arr' array as an argument.
        change(arr);

        // Print the modified 'arr' array after the 'change' method call.
        System.out.println(Arrays.toString(arr));
    }

    // Define a static method named 'change' that takes an integer array as a parameter.
    static void change(int[] num) {
        // Modify the first element (index 0) of the 'num' array to have a value of 8.
        num[1] = 8;
    }
}


