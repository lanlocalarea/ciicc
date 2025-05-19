package Activities;

import java.util.*;

public class Task4 {
        public static void main(String[] args) {
                Scanner wordInput = new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.print("Enter a word: ");
        StringBuilder wordStringChecker = new StringBuilder(wordInput.nextLine());

        String result = (wordStringChecker.toString().equals(wordStringChecker.reverse().toString())) ?
        "The input string is a palindrome" : 
        "The input string is not a palindrome";
        wordInput.close();
        System.out.println(result); 
        }
}
