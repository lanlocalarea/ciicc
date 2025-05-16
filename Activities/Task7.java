package Activities;

import java.util.Scanner;

public class Task7 {
    float sum (float a, float b) {
        return (a + b);
    }
    float difference (float a, float b) {
        return (a - b);
    }
    float product (float a, float b) {
        return (a * b);
    }

    float quotient (float a, float b) {
        return (a / b);
    }



    public static void main(String[] args) {
        Task7 task7 = new Task7();
        Scanner sc = new Scanner(System.in);

        float firstNumber, secondNumber;
        
        System.out.print("\nOperations:\nEnter your first number: ");
        firstNumber = sc.nextFloat();
        System.out.print("Enter your second number: ");
        secondNumber = sc.nextFloat();

        System.out.println("\nResult:\nSum is: " + task7.sum(firstNumber, secondNumber));
        System.out.println("Difference is: " + task7.difference(firstNumber, secondNumber));
        System.out.println("Product is: " + task7.product(firstNumber, secondNumber));
        System.out.println("Quotient is: " + task7.quotient(firstNumber, secondNumber));
        sc.close();
    }
}
