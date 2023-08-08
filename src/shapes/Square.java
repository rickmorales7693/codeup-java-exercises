package shapes;

public class Square extends Quadrilateral implements Measurable {

//    double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
       return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    public Square(int side) {
//    	super(side, side);
//        this.side = side;
//    }

//    public int getArea() {
//        int side = this.length;
//        return side * side;
//    }
//
//    public int getPerimeter() {
//        int side = this.length;
//        return 4 * side;
//    }

}
