package ProgrammingChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberToDayOfWeek {
    public static void main(String[] args) {
        byte numWeek = 0;
        Scanner inputWeek = new Scanner(System.in);
        System.out.print("Type in a number to see which day of the week it is. (1-7): ");

        try {
        numWeek = inputWeek.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            inputWeek.close();
            System.exit(0);
        }

        switch (numWeek) {
            case 1:
                System.out.println("Monday");
                inputWeek.close();
                break;

            case 2:
                System.out.println("Tuesday");
                inputWeek.close();
                break;

            case 3:
                System.out.println("Wednesday");
                inputWeek.close();
                break;

            case 4:
                System.out.println("Thursday");
                inputWeek.close();
                break;

            case 5:
                System.out.println("Friday");
                inputWeek.close();
                break;

            case 6:
                System.out.println("Saturday");
                inputWeek.close();
                break;

            case 7:
                System.out.println("Sunday");
                inputWeek.close();
                break;

            default:
                System.out.println("Invalid input");
                inputWeek.close();
                break;
        }
    }
}