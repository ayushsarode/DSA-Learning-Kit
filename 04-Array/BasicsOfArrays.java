package com.ayush;

public class BasicsOfArrays {
    public static void main(String[] args) {

        // What is Arrays?
        // Simply, Arrays are collections of data elements.

        // SYNTAX:
        // datatype[] variable_name = new datatype[size];

        // Q: store 5 names (STRING ARRAY)
       //  String[] name = {"ayush", "rohit", "virat", "aditya", "ashwin"};
        // System.out.println(name[1]);

        // Store 5 ID (INTEGER ARRAY)
        // int[] ID = {01, 23, 35, 25, 25};

        // int[] RollNo; //declaration of array, RollNo is getting defined in the stack
        // RollNo = new int[5]; //initialisation: actually here object is being created in the memory (heap)

        // System.out.println(RollNo[3]); // by default 0 value

        String[] arr = new String[4];
        System.out.println(arr[0]); // output: null; null is empty object

    }
}
