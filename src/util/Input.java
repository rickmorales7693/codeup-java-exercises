package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        if (scanner.nextLine().equalsIgnoreCase("y") || scanner.nextLine().equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getInt(min, max);
        }
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max){
            return userInput;
        } else {
            System.out.println("Invalid input, try again");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        return scanner.nextDouble();
    }


}
