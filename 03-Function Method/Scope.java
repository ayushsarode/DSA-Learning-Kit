package com.ayush;

// In Java, the scope of a variable determines where in the code that variable can be accessed or modified. Variables declared within a block are only accessible within that block or in nested blocks. Variables declared in a method or outside of any block are accessible throughout the method or class, depending on their scope.

public class Scope {
    public static void main(String[] args) {
        // Declare and initialize variable 'a' to 60
        int a = 60;

        // Declare and initialize variable 'b' to 30
        int b = 30;

        // Declare and initialize variable 'pokemon' to "Pikachu"
        String pokemon = "Pikachu";

        {
            // Inside this block, 'a' is already declared outside the block,
            // so you cannot declare it again.
            // You can, however, reassign its value.
            a = 35; // Reassign the original 'a' variable to 35

            // Declare and initialize a new variable 'pokemon' with "Mewto"
            pokemon = "Mewto";

            // Print the value of 'pokemon' inside this block
            System.out.println(pokemon);

            // Print the value of 'a' inside this block (which is now 35)
            System.out.println(a);
        }

        // Print the value of 'pokemon' outside the block (which is "Mewto")
        System.out.println("Reassigned variable: " + pokemon);

        // Print the value of 'a' outside the block (which is now 35)
        System.out.println(a);

        // 'i' is declared inside the for loop, so it is only accessible within the loop
        for (int i = 3; i < 7; i++) {
            // Print the value of 'i' inside the loop
            System.out.println(i);

            // You can reassign the value of 'a' inside the loop
            a = 766;
        }

        // Print the value of 'a' outside the loop (which is now 766)
        System.out.println(a);

        // 'i' is not accessible outside the for loop, so the following line would result in an error:
        // System.out.println(i);
    }
}
