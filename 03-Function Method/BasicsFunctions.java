
package com.ayush;

import java.util.Scanner;

public class BasicsFunctions {
    public static void main(String[] args) {
          int ans = Finalmul();
        System.out.println("Answer: "  +ans);
    }

//    static void mul() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter number 2: ");
//        int num2 = in.nextInt();
//        int mul = num1 * num2;
//        System.out.println("Answer: " + mul);
//    }
//}

//RETURN value
    static int Finalmul() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int mul = num1 * num2;
        return mul;

        //return will end the function.
//        System.out.println("hi"); //This Line will never execute as the function is over
    }
}


