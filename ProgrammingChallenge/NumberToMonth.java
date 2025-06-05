package ProgrammingChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToMonth {
    public static void main(String[] args) {
        byte month = 0;
        Scanner inputMonth = new Scanner(System.in);
        System.out.print("Enter a numerical month to determine the number of days. (1-12): ");

        try {
        month = inputMonth.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Please put a valid month.");
            inputMonth.close();
            System.exit(0);
        }

        switch (month) {
            case 1:
                System.out.println("January has 31 days.");
                inputMonth.close();
                break;

            case 2:
                System.out.println("February has 28 days.");
                inputMonth.close();
                break;

            case 3:
                System.out.println("March has 31 days.");
                inputMonth.close();
                break;

            case 4:
                System.out.println("April has 30 days.");
                inputMonth.close();
                break;

            case 5:
                System.out.println("May has 31 days.");
                inputMonth.close();
                break;

            case 6:
                System.out.println("June has 30 days.");
                inputMonth.close();
                break;

            case 7:
                System.out.println("July has 31 days.");
                inputMonth.close();
                break;

            case 8:
                System.out.println("August has 31 days.");
                inputMonth.close();
                break;

            case 9:
                System.out.println("September has 30 days.");
                inputMonth.close();
                break;

            case 10:
                System.out.println("October has 31 days.");
                inputMonth.close();
                break;

            case 11:
                System.out.println("November has 30 days.");
                inputMonth.close();
                break;

            case 12:
                System.out.println("December has 31 days.");
                inputMonth.close();
                break;
        
            default:
                System.out.println("Month is invalid");
                inputMonth.close();
                break;
        }
    }
}
