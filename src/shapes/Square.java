package shapes;

public class Square extends Rectangle {

    int side;

    public Square(int side) {
    	super(side, side);
        this.side = side;
    }

    public int getArea() {
        int side = this.length;
        return side * side;
    }

    public int getPerimeter() {
        int side = this.length;
        return 4 * side;
    }

}
