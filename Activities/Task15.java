package Activities;

public class Task15 {
    public static void main(String[] args) {
    Circle circle1 = new Circle("Red", 31);
    Rectangle rectangle1 = new Rectangle("Blue", 13, 14);
    System.out.println("\nCircle: ");
    System.out.println("Area of " + circle1.color + " Circle: " + circle1.calculateArea());
    System.out.println("Perimeter of " + circle1.color + " Circle: " + circle1.calculatePerimeter());
    System.out.println("\nRectangle: ");
    System.out.println("Area of " + rectangle1.color + " Rectangle: " + rectangle1.calculateArea());
    System.out.println("Perimeter of " + rectangle1.color + " Rectangle: " + rectangle1.calculatePerimeter());
    }
}

interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
}


abstract class AbstractShape implements Shape {
    String color;
    double length, width, radius;
    public AbstractShape (String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width =  width;
    }
    public AbstractShape (String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    
    public double calculateArea(){
        double area = length * width;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = (length + width) * 2;
        return perimeter;
    }

}

class Circle extends AbstractShape {

public Circle(String color, double radius){
    super(color, radius);
}
    public double calculateArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}

class Rectangle extends AbstractShape {
public Rectangle(String color, double length, double width){
    super(color, length, width);
}
}