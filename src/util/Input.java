package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

//    public String getString(){
//
//    }

    public boolean yesNo(){
        if (scanner.nextLine().equalsIgnoreCase("y") || scanner.nextLine().equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

//    public int getInt(int min, int max){
//
//    }

//    public int getInt(){
//
//    }

//    public double getDouble(double min, double max){
//
//    }

//    public double getDouble(){
//
//    }


}
