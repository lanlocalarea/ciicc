package Activities;

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32, 32);
        for (int i = 0; i < 5; i++){
            p.scale();
            p.print();
        }
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.println("("+x+","+y+")");
    }

    //your code goes here
    public void scale(){
        if (this.x /2 != 1 && this.y /2 != 1){
            if (this.x > 0 || this.y > 0){
                this.x /= 2;
                this.y /= 2;
            }
        }



    }
}
