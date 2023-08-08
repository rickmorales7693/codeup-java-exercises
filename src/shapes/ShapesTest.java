package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        int side = 5;
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(side);
        System.out.println("The area of box1 is: " + box1.getArea());
        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
        System.out.println("The area of box2 is: " + box2.getArea());
        System.out.println("The perimeter of box2 is: " + box2.getPerimeter());



    }

}