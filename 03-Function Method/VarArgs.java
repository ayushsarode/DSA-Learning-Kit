package com.ayush;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // The main method is the entry point of the program.
        // It's where the execution starts.

//       fun(4,5,2,7,4,8); // This line is commented out.

       // Calling the 'multiple' method with some arguments.
       multiple(2, 3, "ayush", "ash", "peter");
    }

    // The 'multiple' method takes an integer 'a', an integer 'b', and varargs 'v' (a variable number of Strings).
    static void multiple(int a, int b, String ...v){
        // Printing the elements of the 'v' array.
        System.out.println(Arrays.toString(v));
    }

    // The 'fun' method is commented out and not in use.
    // It would take a variable number of integers and print them if it were called.
//    static void fun(int ...a){
//
//        System.out.println(Arrays.toString(a));
//    }

}

