package exercises;

import java.util.Scanner;

public class ExtraJavaExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. Write a program in Java to read 10 numbers from keyboard and find their sum and average.
//        int totalNumbers = 10;
//        int sum = 0;
//        System.out.println("Enter " + totalNumbers + " numbers ");
//        for (int i = 0; i < totalNumbers; i++) {
//            System.out.println("Enter number " + (i + 1) + " and press enter:");
//            int number = sc.nextInt();
//            sum += number;
//        }
//        double average = (double) sum / totalNumbers;
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);




        // 2. Write a program in Java to display the cube of the number upto given an integer. Read the number using the Scanner class.





        // 3. Write a program in Java to display the n terms of odd natural number and their sum. Read the odd number using the Scanner class.





        // 4. Write a program in Java to display the pattern like right angle triangle with a number. Read the number using the Scanner class.





        // 5. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.





        /////Date Format Converter Program/////
        // 6. Take on the following format: MM/DD/YYYY and Output the following: MonthName DD, YYYY (Example: input - 12/01/1999, output - December 12, 1999)

//        System.out.println("Enter a date in the format MM/DD/YYYY:");
//        String date = sc.nextLine();
//        String month = date.substring(0, 2);
//        String day = date.substring(3, 5);
//        String year = date.substring(6);
//        switch (month) {
//            case "01":
//                month = "January";
//                break;
//            case "02":
//                month = "February";
//                break;
//            case "03":
//                month = "March";
//                break;
//            case "04":
//                month = "April";
//                break;
//            case "05":
//                month = "May";
//                break;
//            case "06":
//                month = "June";
//                break;
//            case "07":
//                month = "July";
//                break;
//            case "08":
//                month = "August";
//                break;
//            case "09":
//                month = "September";
//                break;
//            case "10":
//                month = "October";
//                break;
//            case "11":
//                month = "November";
//                break;
//            case "12":
//                month = "December";
//                break;
//        }
//        System.out.println(month + " " + day + ", " + year);



        //////Sentence Analyzer Program//////
        // 7. Create a sentence analyzer program that tells the user how many vowels and consonants were used.
        // Example: input - "The hill are alive."; output - 5 vowels and 10 consonants
//        System.out.println("Enter a sentence:");
//        String sentence = sc.nextLine();
//        int vowels = 0;
//        int consonants = 0;
//        for (int i = 0; i < sentence.length(); i++) {
//            char letter = sentence.charAt(i);
//            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
//            || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
//                vowels++;
//            } else if (letter != ' ') {
//                consonants++;
//            }
//        }
//        System.out.println(vowels + " vowels and " + consonants + " consonants");



        //////Command Line Calculator//////
        // 8. The program should welcome the user, prompt them for a calculation, and give results. The user should be prompted after
        // each result is outputted if they want to enter another calculation. When they say no, give them an exit message. Allow
        // the user first to specify how many operands they will enter. Do not worry about input validation (assume user enters
        //a correct data type).
//        System.out.println("Welcome to the Command Line Calculator!!!");
//        System.out.println("Do you wish to enter a new calculation? (y/n)");
//        String userResponse = sc.nextLine();
//        while (userResponse.equalsIgnoreCase("y")) {
//            System.out.println("How many operands will you calculated?");
//            int numberOfOperands = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Enter your first number:");
//            double firstOperand = sc.nextDouble();
//            sc.nextLine();
//            double result = firstOperand;
//            for (int i = 1; i < numberOfOperands; i++) {
//                System.out.println("Enter your next number:");
//                double nextOperand = sc.nextDouble();
//                sc.nextLine();
//                System.out.println("Enter your operator (+, -, *, /):");
//                String operator = sc.nextLine();
//                switch (operator) {
//                    case "+":
//                        result += nextOperand;
//                        break;
//                    case "-":
//                        result -= nextOperand;
//                        break;
//                    case "*":
//                        result *= nextOperand;
//                        break;
//                    case "/":
//                        result /= nextOperand;
//                        break;
//                    default:
//                        System.out.println("Invalid operator");
//                        break;
//                }
//            }
//            System.out.println("Result: " + result);
//            System.out.println("Do you wish to enter a new calculation? (y/n)");
//            userResponse = sc.nextLine();
//        }



















    }
}
