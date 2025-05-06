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
            if (i == 9)
            System.out.println();
            }    
        
            int count = 0;
            ROW_LOOP: for(int row = 1; row <=3; row++)
            for(int col = 1; col <=2 ; col++) {
            if(row * col % 2 == 0) continue ROW_LOOP;
            count++;
            }
            System.out.println(count);

    }
}
