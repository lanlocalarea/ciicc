package ProgrammingChallenge;

public class MultiplicationTable {

    public static void main(String[] args) {
        
        for (int a = 1 ; a <= 10; a++) {
            System.out.print(a);

            for (int b = 2; b <= 10 ; b++){
                System.out.print("\t" + a*b);
            }
            System.out.println("\n");
        }
        
    }

}