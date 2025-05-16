package Sandbox;
import static java.util.Arrays.*;
import static java.util.ArrayList.*;

public class Chap3ArrayReview {
    public static void main(String[] args) {
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        System.out.println(againStrings[0]);
        
        System.out.println(Chap3and4Review.earthsGravity());
        

    }
}
