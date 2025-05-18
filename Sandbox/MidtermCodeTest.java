package Sandbox;

import java.time.LocalDate;

public class MidtermCodeTest {
    static int x = 20;
    public static void main(String[] args) {
        MidtermCodeTest pr = new MidtermCodeTest();
        pr.x = 5;
        int y = x/pr.x;
        System.out.print("y = ");
        System.out.println(y); // Output 1

        char c[] = new char[]{'a','b','c'};
			String cd = "abcdef".substring(4);
			String s1 = new String(c);
			s1 += cd;
			System.out.println(s1); // Output "abcef"

            Double d = new Double(12.85);
            int i = d.intValue();
            System.out.println(i); // Output 12

			LocalDate date = LocalDate.of(2015, 1, 20);
			System.out.println(date);
    }
}
