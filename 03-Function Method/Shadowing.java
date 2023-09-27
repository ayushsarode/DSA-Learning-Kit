package com.ayush;

// In Java, "shadowing" refers to the situation where a variable declared within a particular scope has the same name as a variable declared in an outer scope. When this occurs, the inner variable "shadows" the outer variable, effectively hiding it from the inner scope.

public class Shadowing {
    static int x = 24; // Declare a static integer variable 'x' with the value 24

    public static void main(String[] args) {
        System.out.println(x); // Print the value of 'x' (24) from the class scope
        int x; // Declare a local integer variable 'x'
        x = 57; // Assign the value 57 to the local 'x' variable
        System.out.println(x); // Print the value of the local 'x' variable (57)

        Num(); // Call the 'Num' method
    }

    static void Num() {
        System.out.println(x); // Print the value of the static class variable 'x' (24)
    }
}

