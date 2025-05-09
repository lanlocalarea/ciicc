package Sandbox;

 class Tiger {
    String name;
}

public class Chap3Review {
public static void main(String[] args) {
    String a = "a";
    int b = 2;
    String c = "c";
    System.out.println((a + b + c).getClass());

    String s1 = "1";
    String s2 = s1.concat("2");
    s2.concat("3");
    System.out.println(s2);

    String word = "carlos go";
    System.out.println(word.charAt(5));
    System.out.println(word.indexOf("carl"));
    System.out.println(word.substring(word.indexOf("l")));
    System.out.println(word.startsWith("car"));
    System.out.println(word.endsWith("las"));
    System.out.println(word.endsWith(word.substring(word.indexOf("l"))));
    System.out.println(word.startsWith("Carl"));
    System.out.println(word.replace("car", "CAR"));
    System.out.println(word);
    System.out.println(word.replace("o", "O"));

    StringBuilder text1 = new StringBuilder("start");
    text1.append("+middle");
    System.out.println(text1);
    StringBuilder text2 = text1.append("+end");
    System.out.println(text1 + "\n" + text2);

    //Mutability and Chaining
    StringBuilder d = new StringBuilder("abc");
    StringBuilder e = d.append("de");
    e = e.append('f').append('g');
    System.out.println("d = " + d);
    System.out.println("e = " + e);

    Tiger t1 = new Tiger(); 
    Tiger t2 = new Tiger();
    Tiger t3 = t1;
    System.out.println((t1 == t1) +" "+ (t1 == t2) +" "+ (t1 == t3) +" "+ t1.equals(t3));
    


}   


}
