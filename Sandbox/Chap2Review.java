package Sandbox;
public class Chap2Review {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        short a = 14;
        float b = 13;
        double c = 30;
        

        System.out.println(a * b / c);

        long d = 10;
        int e = 5;
        e *= d;
        System.out.println(((Object) e).getClass().getName());

        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            }    
        

    }
}
