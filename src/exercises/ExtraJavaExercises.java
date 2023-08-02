package exercises;

import java.util.Scanner;

public class ExtraJavaExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. Write a program in Java to read 10 numbers from keyboard and find their sum and average.
        int totalNumbers = 10;
        int sum = 0;
        System.out.println("Enter " + totalNumbers + " numbers ");
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Enter number " + (i + 1) + " and press enter:");
            int number = sc.nextInt();
            sum += number;
        }
        double average = (double) sum / totalNumbers;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);




        // 2. Write a program in Java to display the cube of the number upto given an integer. Read the number using the Scanner class.





        // 3. Write a program in Java to display the n terms of odd natural number and their sum. Read the odd number using the Scanner class.





        // 4. Write a program in Java to display the pattern like right angle triangle with a number. Read the number using the Scanner class.





        // 5. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.




















    }
}
