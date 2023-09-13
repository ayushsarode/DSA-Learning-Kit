package com.Ayush;

// Fibonacci Number :- The Fibonacci sequence is a type series where each number is the sum of the two that precede it. It starts from 0 and 1 usually. The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on. By adding 0 and 1, we get the third number as 1. Then by adding the second and the third number (i.e) 1 and 1, we get the fourth number as 2, and similarly, the process goes on. Thus, we get the Fibonacci series as 0, 1, 1, 2, 3, 5, 8, ……. Hence, the obtained series is called the Fibonacci number series.

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
