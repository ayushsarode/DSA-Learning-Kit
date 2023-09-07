package com.Ayush;

public class ifElse {
    public static void main(String[] args) {
        /*
        Syntax of if statement:
        if (boolean expression T or F) {
        // body
        } else {
        //do this
         */


//        int salary = 25400;
//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else
//        {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);



        // multiple if-else
        int salary = 15400;
        if (salary > 20000) {
            salary += 3000; // += means salary = salary + 2000

        } else if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
