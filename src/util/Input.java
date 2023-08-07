package util;

import java.util.Scanner;

public class Input {
    /// Instance Field/Property/Variable
    private Scanner scanner;

    /// Constructors
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    /// Instance Methods
    public String getString(){
        return this.scanner.nextLine();
    }

    /// Returns true if user enter "yes", "Y", "yassss" or false if user enters something that isn't interpreted as "yes"
    public boolean yesNo(){
        if (this.scanner.nextLine().equalsIgnoreCase("y") || this.scanner.nextLine().equalsIgnoreCase("yes")){
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
