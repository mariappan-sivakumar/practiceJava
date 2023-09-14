package Day5;


public class Inheritance {
    public static void main(String[] args) {
        Rectangle shape=new Rectangle("red","rectangle", 10,5);
        shape.printa();

    }
}
class Shape {
    String colour;
    String shapeName;
    int a=10;

    public Shape(String colour, String shapeName) {
        this.colour = colour;
        this.shapeName = shapeName;
    }
}
class RightTriangle extends Shape {
    private int base,height;
//    int a=100;

    public RightTriangle(String colour, String shapeName, int base, int height) {
        super(colour, shapeName);
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5*base*height;
    }


    public double calculatePerimeter() {
        double side=Math.sqrt(Math.pow(height,2)+Math.pow(base,2));
        return side+base+height;
    }
}
class Rectangle extends RightTriangle {
    int length, breadth;
//    int a=1000;

    public Rectangle(String colour, String shapeName, int base, int height) {
        super(colour, shapeName, base, height);
    }

    public double calculatePerimeter() {
        return 2*(length+breadth);
    }

    public double calculateArea() {
        return length*breadth;
    }
    public void printa(){
        System.out.println(a);
    }
}
