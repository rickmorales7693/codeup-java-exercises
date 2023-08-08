package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        super(length, width);
        this.length = length;
        this.width = width;
    }

//    public int getArea(){
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }


    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
