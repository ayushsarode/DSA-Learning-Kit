package com.ayush;

import java.util.Scanner;

public class PassValuesToMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Base:");
        int base = in.nextInt();
        System.out.println("Height:");
        int height = in.nextInt();
        int Result = AreaOfTriangle(base, height);
        System.out.println(Result);
    }

    // Formula - 1/2 * base * height
    static int AreaOfTriangle(int base, int height) {
        double formula = 0.5 * base * height;
        return (int) formula;
    }
}
