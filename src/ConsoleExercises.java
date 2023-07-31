import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + pi);
//        System.out.format("The value of pi is approximately %.2f", pi);


//        System.out.print("\nEnter an integer: ");
//        int userInt = sc.nextInt();
//        System.out.println("You entered: " + userInt);


//        System.out.print("\nEnter 3 words: ");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);


//        System.out.println("\nEnter a sentence: ");
//        String userSentence1 = sc.next();
//        System.out.println(userSentence1);

//        System.out.println("\nEnter a sentence: ");
//        String userSentence2 = sc.nextLine();
//        System.out.println(userSentence2);



        System.out.println("\nEnter the length of the classroom: ");
        double length = sc.nextDouble();
        System.out.println("\nEnter the width of the classroom: ");
        double width = sc.nextDouble();
        System.out.println("\nEnter the height of the classroom: ");
        double height = sc.nextDouble();

        double area = length * width;
        System.out.println("The area of the classroom is: " + area);
        double perimeter = (length * 2) + (width * 2);
        System.out.println("The perimeter of the classroom is: " + perimeter);
        double volume = length * width * height;
        System.out.println("The volume of the classroom is: " + volume);











    }
}
