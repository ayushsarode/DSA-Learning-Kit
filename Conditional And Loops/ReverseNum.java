package com.Ayush;

public class ReverseNum {
    public static void main(String[] args) {
        // Initialize the original integer
        int num = 123456;

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
