import java.util.Random;
import java.util.Scanner;

public class ExceptionExercises {

    public static void main(String[] args) {
        divideNums(4, 0);
        divideNums(1, 0);
        divideNums(2, 0);
        divideNums(5, 0);
        delayedHello(3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        displayTypingEffect(input);
    }

    public static int divideNums(int num1, int num2) {
        /// Cannot use IllegalArgumentException because it is a RuntimeException
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0");
            return 0;
        }

    }

    public static void delayedHello(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println("Hello!");
    }

    public static void displayTypingEffect(String input){
        Random rand = new Random();

        for(char c : input.toCharArray()){
            System.out.println(c);
            int delay = 50 + rand.nextInt(100);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }


}
