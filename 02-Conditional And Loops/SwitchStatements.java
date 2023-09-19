package com.Ayush;

import java.util.Objects;
import java.util.Scanner;

//In Java, the switch statement allows you to evaluate a single expression against multiple possible values and execute code based on matching cases.

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System
                .in);
// NOTE -
//        In Java, we use .equals() to compare string content because it checks if the actual characters in the strings are the same, whereas == checks if the string references point to the same memory location.

//        When you use == to compare two string references, it checks if the references point to the same memory location (i.e., if they are the same object in memory).


        String Cars = in.next();
        switch (Cars) {
            case "Lamborghini":
                System.out.println("Yellow one is good");
                break;
            case "Maybach":
                System.out.println("Luxury one");
                break;
            case "BMW":
                System.out.println("German Car");
                break;
            case "Mercedes":
                System.out.println("Volkswagen Car");
                break;
            default:
                System.out.println("Please enter a valid Car name");
    }
    }
}


//  SWITCH ENHANCED MODE

//        String Cars = in.next();
//        switch (Cars) {
//            case "Lamborghini" -> System.out.println("Yellow one is good");
//            case "Maybach" -> System.out.println("Luxury one");
//            case "BMW" -> System.out.println("German Car");
//            case "Mercedes" -> System.out.println("Volkswagen Car");
//            default -> System.out.println("Please enter a valid Car name");
//        }
//    }
//}


//        int month = in.nextInt();
//        switch (month) {
//            case 1 -> System.out.println("January");
//            case 2 -> System.out.println("February");
//            case 3 -> System.out.println("March");
//            case 4 -> System.out.println("April");
//            case 5 -> System.out.println("May");
//            case 6 -> System.out.println("June");
//            case 7 -> System.out.println("July");
//            case 8 -> System.out.println("August");
//            case 9 -> System.out.println("September");
//            case 10 -> System.out.println("October");
//            case 11 -> System.out.println("November");
//            case 12 -> System.out.println("December");
//
//        }


//        int day = in.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekend");
//
//        }





//SYNTAX -
//switch (expression) {
//        case value1:
//        // Code to execute if expression equals value1
//        break;
//        case value2:
//        // Code to execute if expression equals value2
//        break;
//        // ...
//        case valueN:
//        // Code to execute if expression equals valueN
//        break;
//default:
//        // Code to execute if expression doesn't match any of the cases
//        }
