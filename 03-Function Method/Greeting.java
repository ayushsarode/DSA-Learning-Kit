package com.ayush;

public class Greeting {
    public static void main(String[] args) {
        // The main method is the entry point of the program.

        // We call the greet() function here, which is defined below.
        greet();
    }

    // This is the greet() function, which is defined as "static void".
    // "static" means it belongs to the class and not to any specific object instance.
    // "void" means it doesn't return a value.
    static void greet() {
        // Inside the greet() function, we use the System.out.println() method to print a message.
        // In this case, it prints "Namaste!" to the console.
        System.out.println("Namaste!");
    }
}
