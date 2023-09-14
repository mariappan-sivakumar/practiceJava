public class Rectangle {
    private int breadth;
    private int height;
    public void setDimension(int breadth, int height){
        this.breadth=breadth;
        this.height=height;
    }
    public int getArea(){
        return this.breadth*this.height;
    }
}
