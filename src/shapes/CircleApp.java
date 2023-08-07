package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        do{
            double radius = input.getDouble("Enter a decimal number for the radius of a circle");
            Circle myCircle = new Circle(radius);

            System.out.printf("The area of your circle is %.2f, the cicrumference is %.2f.%n", myCircle.getArea(), myCircle.getCircumference());
            System.out.println("Would you like to create another circle? Y|N");
        }while(input.yesNo());
    }
}
