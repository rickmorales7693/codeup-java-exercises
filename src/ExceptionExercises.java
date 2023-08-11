import java.util.Random;
import java.util.Scanner;

public class ExceptionExercises {

    public static void main(String[] args) {
        System.out.println(divideNums(10, 2));
        System.out.println(divideNums(10, 0));
        delayedHello(3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        displayTypingEffect(input);
    }

    public static double divideNums(int num1, int num2) {

        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
            return (double) num1 / num2;
    }

    public static void delayedHello(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
        System.out.println("Hello!");
    }

    public static void displayTypingEffect(String input) {
        Random rand = new Random();

        for (char c : input.toCharArray()) {
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
