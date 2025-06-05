package ProgrammingChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        float score = 0;
        String grade = "Grade: ";
        Scanner inputScore = new Scanner(System.in);
        System.out.print("Please input your Score (0-100): ");

        try {
        score = inputScore.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Please put a valid grade.");
            inputScore.close();
            System.exit(0);
        }

        if(score > 90)
        System.out.println(grade + "A");
        else if(score > 80 && score < 89)
        System.out.println(grade + "B");
        else if(score > 70 && score < 79)
        System.out.println(grade + "C");
        else if(score > 70 && score < 79)
        System.out.println(grade + "D");
        else if(score < 60)
        System.out.println(grade + "F");
        inputScore.close();
    }
}
