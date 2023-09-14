package Day5;

public class MultipleHybridInterface {
    public static void main(String[] args) {
        SquareClass square=new SquareClass();
//        System.out.println(square.a);
        square.setColour("red");
        square.setLength(5);
        System.out.println(square);
    }
}

class SquareClass implements SquareInterface{
    private String colour;
    private String shapeName="Square";
    private int length;
    @Override
    public void setColour(String colour) {
        this.colour=colour;
    }

    @Override
    public void setShapeName(String shapeName) {
        this.shapeName=shapeName;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }

    @Override
    public String toString() {
        return "SquareClass{" +
                "shapeName='" + shapeName + '\'' +
                ", colour='" + colour + '\'' +
                ", length= " + length +
                ", Perimeter= "+ getPerimeter()+
                ", Area= "+ getArea()+
                '}';
    }
}


class RectangleClass implements RectangleInterface{
    String colour;
    String shapeName="Rectangle";
    int length;
    int breadth;
    @Override
    public void setColour(String colour) {
        this.colour=colour;
    }

    @Override
    public void setShapeName(String shapeName) {
        this.shapeName=shapeName;
    }

    @Override
    public double getArea() {
        return length*breadth;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+breadth);
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }

    @Override
    public void setBreadth(int breadth) {
        this.breadth=breadth;
    }

    @Override
    public String toString() {
        return "RectangleClass{" +
                "shapeName='" + shapeName + '\'' +
                ", colour='" + colour + '\'' +
                ", length=" + length +
                ", breadth=" + breadth +
                ", Perimeter= "+ getPerimeter()+
                ", Area= "+ getArea()+
                '}';
    }
}

interface Base{
    void setColour(String colour);
    void setShapeName(String shapeName);
    int a=5;
}
interface Properties{
    double getArea();
    double getPerimeter();

}

interface SquareInterface extends Base, Properties{
    void setLength(int length);
}

interface RectangleInterface extends SquareInterface{
    void setBreadth(int breadth);
}
