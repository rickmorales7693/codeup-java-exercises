package shapes;

public class Square extends Rectangle {


    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int side) {
    	super(side, side);

    }

    public int getArea() {
//    	return this.length * this.width;
        int side = this.length;
        return side * side;
    }

    public int getPerimeter() {
//    	return 4 * this.length;
        int side = this.length;
        return 4 * side;
    }

    public int getLength() {
    	return this.length;
    }

    public int getWidth() {
    	return this.width;
    }








}
