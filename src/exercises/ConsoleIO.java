package exercises;

import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userInput = sc.nextLine();
        System.out.println("What is your age? ");
        int usersAge = sc.nextInt();
        System.out.printf("The users name is %s, and the users age is: %d", userInput, usersAge);





    }



}
