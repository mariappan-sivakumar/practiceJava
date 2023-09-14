package Day4;

public class RightTriangle extends Shape{
    private int base,height;

    public RightTriangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }

    @Override
    public double calculatePerimeter() {
        double side=Math.sqrt(Math.pow(height,2)+Math.pow(base,2));
        return side+base+height;
    }


}
