package exercises;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(2, 2));
//        System.out.println(subtraction(2, 2));
//        System.out.println(multiplication(2, 2));
//        System.out.println(division(2, 2));
//        System.out.println("User input: " + getInteger(1, 10));
//        System.out.println(getFactorial());
//        System.out.println(diceRolling());
//        System.out.println(gameDevelopment());
    }

//    public static double addition(double num1, double num2) {
//        return num1 + num2;
//    }

//    public static double subtraction(double num1, double num2) {
//        return num1 - num2;
//    }

//    public static double multiplication(double num1, double num2) {
//        return num1 * num2;
//    }

//    public static double division(double num1, double num2) {
//        return num1 / num2;
//    }

//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        int userInput = 0;
//        System.out.print("Please enter a number between " + min + " and " + max + ": ");
//
//        while (true) {
//            try {
//                userInput = Integer.parseInt(sc.nextLine());
//                if (userInput >= min && userInput <= max) {
//                    return userInput;
//                } else {
//                    System.out.print("Please enter a number between " + min + " and " + max + ": ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.print("Please enter a valid number between " + min + " and " + max + ": ");
//            }
//        }
//    }


//    public static long getFactorial() {
//        Scanner sc = new Scanner(System.in);
//        long userInput = 0;
//        long factorial = 1;
//        System.out.print("Please enter a number between 1 and 10: ");
//
//        while (true) {
//            try {
//                userInput = Integer.parseInt(sc.nextLine());
//                if (userInput >= 1 && userInput <= 10) {
//                    for (long i = 1; i <= userInput; i++) {
//                        factorial *= i;
//                    }
//                    return factorial;
//                } else {
//                    System.out.print("Please enter a number between 1 and 10: ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.print("Please enter a valid number between 1 and 10: ");
//            }
//        }
//    }

//    public static int diceRolling() {
//        Scanner sc = new Scanner(System.in);
//        int userInput = 0;
//        int dice1 = 0;
//        int dice2 = 0;
//        System.out.print("Please enter a number between 1 and 10: ");
//
//        while (true) {
//            try {
//                userInput = Integer.parseInt(sc.nextLine());
//                if (userInput >= 1 && userInput <= 10) {
//                    for (int i = 1; i <= userInput; i++) {
//                        dice1 = (int) Math.ceil(Math.random() * 6);
//                        dice2 = (int) Math.ceil(Math.random() * 6);
//                        System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
//                    }
//                } else {
//                    System.out.print("Please enter a number between 1 and 10: ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.print("Please enter a valid number between 1 and 10: ");
//            }
//            System.out.print("\nDo you want to continue? [y/n]: ");
//            String userContinue = sc.next();
//            System.out.print("\nPlease enter a number between 1 and 10: ");
//            sc.nextLine();
//            if (!userContinue.equalsIgnoreCase("y")) {
//                break;
//            }
//        }
//        return userInput;
//    }



}