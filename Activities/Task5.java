package Activities;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        double[] threeNumbers = new double[3];
        Scanner numberInput = new Scanner(System.in);

        System.out.println("Check for largest number in 3 inputs");
        System.out.print("Enter your first number: ");
        threeNumbers[0] = numberInput.nextDouble();
        System.out.print("Enter your second number: ");
        threeNumbers[1] = numberInput.nextDouble();
        System.out.print("Enter your third number: ");
        threeNumbers[2] = numberInput.nextDouble();
        Arrays.sort(threeNumbers);
        if (threeNumbers[2] > threeNumbers[1])
            System.out.println("The largest number is " + threeNumbers[2]);
        else if ((threeNumbers[2] == threeNumbers[1]) && (threeNumbers[2]== threeNumbers[0]))
            System.out.println("All numbers are equal");
        numberInput.close();
        

        


    }
}
