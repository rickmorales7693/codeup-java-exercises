package shapes;

public class Square extends Quadrilateral implements Measurable {

    double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        double side = this.length;
        return 4 * side;
    }

    @Override
    public double getArea() {
        double side = this.length;
        return side * side;
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
