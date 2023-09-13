package com.Ayush;

// Fibonacci Number :- The Fibonacci sequence is a type series where each number is the sum of the two that precede it. It starts from 0 and 1 usually. The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Prev = 0;
        int Current = 1;
        int count = 2;


        while (count <= n) {
            int TempV = Current;
            Current = Current + Prev;
            Prev = TempV;
            count++;
        }

        System.out.println(
                Current
        );
    }
}
