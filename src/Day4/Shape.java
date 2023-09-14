package Day4;

public class Shape implements Properties {
    int area;
    int perimeter;
    public double calculateArea(){
        return area;
    }

    @Override
    public double calculatePerimeter() {
        return perimeter;
    }
}
