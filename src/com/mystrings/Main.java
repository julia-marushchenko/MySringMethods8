/**
 *  Java program to demonstrate method replace() of class String.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a string variable.
        String str = "Hello World. World is around.";

        // Checking if str has word 'World'.
        if (str.contains("World")) {

            // Replacing World with Europe.
            str = str.replace("World", "Europe");

        }

        // Printing str to console.
        System.out.println(str); // Output: Hello Europe. Europe is around.

    }
}