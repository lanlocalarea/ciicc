package Sandbox;

import java.util.Scanner;

public class StringBuilderPalindrome {
    public static void main(String[] args) {
        Scanner wordInput = new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.print("Enter a word: ");
        StringBuilder wordStringChecker = new StringBuilder(wordInput.nextLine());
        String wordHolder = wordStringChecker.toString();

        String result = (wordStringChecker.toString().equals(wordStringChecker.reverse().toString())) ?
         wordHolder + " is a palindrome" : 
         wordHolder + " is not a palindrome";
        wordInput.close();
        System.out.println(result); 

        
    }
    
}
