package Sandbox;

public class Chap3ArrayReview {
    public static void main(String[] args) {
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        System.out.println(againStrings[0]);
        

    }
}
