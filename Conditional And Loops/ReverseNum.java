package com.Ayush;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Initialize the original integer
        int num = in.nextInt();

        // Initialize a variable to store the reversed integer
        int ans = 0;

        // Reverse the digits of the integer
        while (num > 0) {
            // Get the last digit of 'num'
            int rem = num % 10;

            // Remove the last digit from 'num'
            num /= 10;

            // Add the last digit to 'ans' in reverse order
            ans = ans * 10 + rem;
        }

        // Print the reversed integer
        System.out.println(ans);
    }
}
