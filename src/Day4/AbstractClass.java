package Day4;

public class AbstractClass{
    public static void main(String[] args)
    {
        Abstract rightTriangle=new RightTriangle1("red",6,5);
        Abstract rectangle=new Rectangle1(2,4,"red");
        System.out.println(rightTriangle+" "+rectangle);

    }


}

abstract class Abstract {
    String colour;
    String shapeName;

    public Abstract(String colour, String shapeName) {
        this.colour = colour;
        this.shapeName = shapeName;
    }

    public Abstract(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    abstract public double calculatePerimeter() ;
    abstract public double calculateArea();
}
class RightTriangle1 extends Abstract {
    private int base, height;


//    public RightTriangle1(String colour, String shapeName, int base, int height) {
//        super(colour, shapeName);
//        this.base = base;
//        this.height = height;
//    }

    public RightTriangle1(String colour, int base, int height) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        double side = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
        return side + base + height;
    }
}
     class Rectangle1 extends Abstract {
        int length, breadth;

        public Rectangle1(int length, int breadth, String color) {
            super(color);
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
    class Circle1 extends Abstract {
        private int radius;

        public Circle1(int radius,String colour) {
            super(colour);
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI*Math.pow(radius,2);
        }

        @Override
        public double calculatePerimeter() {
            return 2*Math.PI*radius;
        }
    }




