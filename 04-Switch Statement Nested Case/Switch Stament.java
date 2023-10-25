
package com.Ayush;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read studentID from user input
        int studentID = in.nextInt();

        // Read Branch from user input
        String Branch = in.next();

        // Outer switch statement based on studentID
        switch (studentID) {
            case 1:
                System.out.println("Ayush"); // Print student's name
                break;
            case 2:
                System.out.println("Prajwal"); // Print student's name
                break;
            case 3:
                System.out.println("Sanand"); // Print student's name
            case 4:
                System.out.println("studentID Number 4 ");
                // Inner switch statement based on Branch
                switch (Branch) {
                    case "IT":
                        System.out.println("IT Branch"); // Print branch name
                        break;
                    case "CSE":
                        System.out.println("CSE Branch"); // Print branch name
                        break;
                    case "AI":
                        System.out.println("AI Branch"); // Print branch name
                        break;
                    default:
                        System.out.println("This Branch is not available"); // Default if branch is not recognized
                }
                break;
            default:
                System.out.println("Enter Correct studentID"); // Default if studentID is not recognized
        }
    }
}
