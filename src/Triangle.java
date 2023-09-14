public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1 + this.side2+this.side3;
    }
    public double getArea(){
        double area, semiperimeter;
        semiperimeter=(this.side1+this.side2+this.side3)/2;
        area=Math.pow(semiperimeter*(semiperimeter-this.side1)*(semiperimeter-this.side2)*(semiperimeter-this.side3),0.5);
        return area;
    }
}
