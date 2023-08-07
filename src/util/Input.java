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
        return this.getString().trim().toLowerCase().startsWith("y");
    }


    public int getInt(){
        try {
            return Integer.parseInt(this.getString());
        } catch (NumberFormatException e){
            System.out.println("You must enter a whole number");
            return this.getInt();
        }
    }

    public int getInt(int min, int max){
        int userInt = this.getInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        }else{
            System.out.printf("The number must be between %d and %d. Please try again.%n", min, max);
            return getInt(min, max);
        }
    }

    public double getDouble(){
        try {
            return Double.parseDouble(this.getString());
        } catch (NumberFormatException e){
            System.out.println("You must enter a whole number");
            return this.getDouble();
        }
    }

    public double getDouble(double min, double max){
        double userDouble = this.getDouble();
        if(userDouble >= min && userDouble <= max){
            return userDouble;
        }else{
            System.out.printf("The number must be between %d and %d. Please try again.%n", min, max);
            return getDouble(min, max);
        }
    }



}
