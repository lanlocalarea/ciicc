package Sandbox;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] copyFrom = {
               "Chocolate Cake", "Cheesecake", "Red Velvet Cake", "Vanilla Cake", "Sponge Cake","Pumpkin Spice Cake", "Strawberry Cake", "Carrot Cake", "Butter Cake", "Funfetti Cake", "Marble Cake","Pistachio Cake", "Cookie Cake" };
           
           String[] copyTo = new String[7];
           System.arraycopy(copyFrom, 2, copyTo, 0, 7);
           for (String cakes : copyTo) {
               System.out.print(cakes + ", ");           
           }
        
     }
}
