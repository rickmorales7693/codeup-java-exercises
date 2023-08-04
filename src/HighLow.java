import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        System.out.println(highLow());
    }

    public static int highLow(){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int userGuess;
        int numberOfGuesses = 0;
        System.out.println("Guess a number between 1 and 100: ");
        do {
            userGuess = scanner.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                numberOfGuesses++;
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
                numberOfGuesses++;
            } else {
                System.out.println("GOOD GUESS!");
                numberOfGuesses++;
            }
        } while (userGuess != randomNumber);
        return numberOfGuesses;
    }



}
