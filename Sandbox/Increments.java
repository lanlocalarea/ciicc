package Sandbox;

public class Increments {
/** 
 * Prefix increment and Postfix increment
 * 
 */
    public static void main(String[] args) {
        int i = 10, n = i++ % 5;
         
        System.out.println("i: " + i + "\ni++%5: " + n); // Result: i = 11, n = 0

        // int i = 10, n = ++i % 5; | Result: i = 11, n = 1

    }

};