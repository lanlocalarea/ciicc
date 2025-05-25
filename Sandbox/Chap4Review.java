package Sandbox;

public class Chap4Review {
      
    private static void check (Climb climb, int height){
        if (climb.isTooHigh(height, 10))
        System.out.println("too high");
        else
        System.out.println("ok");
    }

    public static void main(String[] args) {
        check((h,l) -> h>l ,5);
    }

}

interface Climb {
    boolean isTooHigh(int height, int limit);    
}

