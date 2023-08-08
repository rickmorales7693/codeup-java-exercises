package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return 2 * length + 2 * width;
    }

    public int getLength() {
    	return this.length;
    }

    public int getWidth() {
    	return this.width;
    }








}