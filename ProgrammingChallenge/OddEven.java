package ProgrammingChallenge;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a valid number: ");
        int number = sc.nextInt();
        if (number == 0) { 
            System.out.println("The number is Zero");
            sc.close();
            return;
        }
        String result = (number % 2 != 0) ? number + " is an Odd number" : number + " is an Even number";
        System.out.print(result);
        
        if (number < 0 ) 
            System.out.println(" and is a negative number");
        
        else if (number > 0) 
            System.out.println(" and is a positive number.");
        
        else
        System.out.println("Please input a valid Integer.");
        sc.close();
    }
    
}
