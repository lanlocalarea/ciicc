package Sandbox;

import java.util.ArrayList;
import java.util.List;

public class Chap3and4Review {
    public static void main(String[] args) {

        //NullPointerException
        // List heights = new ArrayList<>();
        // heights.add(null);
        // Object h = heights.get(0);
        // System.out.println(h.toString());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(earthsGravity());

        

    }
    public static float earthsGravity(){
        return 9.8f;
    }
}
