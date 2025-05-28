package Activities;
import static java.lang.Math.*;


public class Task9 {
    
    public static int add (int a, int b) {

        return Math.addExact(a, b);
    }

        public static int subtract (int a, int b) {
        
        return Math.subtractExact(a, b);
    }

    public static int multiply (int a, int b) {
        return Math.multiplyExact(a, b);
    }

        public static float divide (int a, int b) {
        return Math.floorDiv(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Operations using static import of math class:  ");
        System.out.println("Sum of 5 and 4 is: " + add(5, 4));
        System.out.println("Difference of 6 and 2 is: " + subtract(6, 2));
        System.out.println("Product of 3 and 5 is: " + multiply(3, 5));
        System.out.println("Quotient of 5 and 9 is: " + divide(5, 2));
    }
}
