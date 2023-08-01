package exercises;


import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Loop Basics
//
//        // 1a. While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while(i <= 15){
//            System.out.println("i is " + i);
//            i++;
//        }



//        // 1b. Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1000000);



//        // 1c. For
//        Refactor the previous two exercises to use a for loop instead.
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//        for(long i = 2; i <= 1000000; i *= i){
//            System.out.println(i);
//        }



        // 2. Fizzbuzz
//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }



        // 3. Table of Powers
//        while (true) {
//            System.out.print("\nEnter an number: ");
//            int userInt = sc.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.printf("%-7d| %-8d| %-6d%n", i, i * i, i * i * i);
//            }
//            System.out.print("\nDo you want to continue? [y/n]: ");
//            String userContinue = sc.next();
//            if (!userContinue.equalsIgnoreCase("y")) {
//                break;
//            }
//        }



        // 4. Convert number grades into letter grades and edit the grade ranges to include pluses and minuses
//        while(true){
//            System.out.print("\nEnter a number grade from 0 to 100: ");
//            int numberGrade = sc.nextInt();
//            if(numberGrade >= 88){
//                System.out.println("A");
//            }else if(numberGrade >= 80){
//                System.out.println("B");
//            }else if(numberGrade >= 67){
//                System.out.println("C");
//            }else if(numberGrade >= 60){
//                System.out.println("D");
//            }else{
//                System.out.println("F");
//            }
//            System.out.print("\nDo you want to continue? [y/n]: ");
//            String userContinue = sc.next();
//            if (!userContinue.equalsIgnoreCase("y")) {
//                break;
//            }
//        }
















    }
}
