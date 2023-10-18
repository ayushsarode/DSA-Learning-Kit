package com.ayush;

public class Overloading {
    public static void main(String[] args) {
        /*
        // Two int sum
        int ans = sum(35, 25);
        System.out.println(ans);
        */

        // Three int sum
        int ans = sum(35, 25, 25);
        System.out.println(ans);

        // Calling String
        String info = FullName("Ayush", "Sarodey");
        System.out.println(info);
    }

    static int sum(int a, int b) {
        System.out.println("Two integer sum");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("Three integer sum");
        return a + b + c;
    }

    static String FullName(String name, String surname) {
        return name + surname;
    }

    /*
    static void value(int a) {
        System.out.println(a);
    }

    static void value(String name) {
        System.out.println(name);
    }
    */
}
