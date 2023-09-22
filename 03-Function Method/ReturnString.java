package com.ayush;

import java.util.Scanner;

public class ReturnString {
    public static void main(String[] args) {
        String message = Name();
        System.out.println(message);
    }

    static String Name() {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String PersonName = in.next();
        String Greet = "Hey , " + PersonName + " Nice to meet yaa!";
        return Greet;
    }
}
