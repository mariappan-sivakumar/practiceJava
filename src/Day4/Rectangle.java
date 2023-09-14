package Day4;

public class Rectangle extends Shape{
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double calculateArea() {
        return length*breadth;
    }
}
