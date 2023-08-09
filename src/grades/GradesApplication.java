package grades;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        studentString();

    }

    private static void studentString(){
        HashMap<String, Student> students = getStringStudentHashMap();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();

        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println("\nOptions:");
            System.out.println("1: Get student info");
            System.out.println("2: View all students and grades");
            System.out.println("3: View overall class average");
            System.out.println("4: Print a CSV report of all students");
            System.out.println("5: Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("\nEnter a GitHub username:");
                    String input = scanner.nextLine();
                    if (students.containsKey(input)) {
                        Student student = students.get(input);
                        System.out.println("\nName: " + student.getName() + " - GitHub Username: " + input);
                        System.out.println("Grades: " + student.getGrades());
                        System.out.println("Average: " + student.getGradeAverage());
                    } else {
                        System.out.println("\nSorry, no student found with the GitHub username of \"" + input + "\".");
                    }
                }
                case 2 -> {
                    for (String username : students.keySet()) {
                        Student student = students.get(username);
                        System.out.println("\nName: " + student.getName() + " - GitHub Username: " + username);
                        System.out.println("Grades: " + student.getGrades());
                        System.out.println("Average: " + student.getGradeAverage());
                    }
                }
                case 3 -> {
                    double totalAverage = students.values().stream().mapToDouble(Student::getGradeAverage).average().orElse(0.0);
                    System.out.println("\nOverall class average: " + totalAverage);
                }
                case 4 -> {
                    System.out.println("\nCSV Report:");
                    System.out.println("Name, GitHub Username, Grades, Average");
                    for (String username : students.keySet()) {
                        Student student = students.get(username);
                        System.out.println(student.getName() + ", " + username + ", " + student.getGrades() + ", " + student.getGradeAverage());
                    }
                }
                case 5 -> continueLoop = false;
                default -> System.out.println("\nInvalid choice. Please try again.");
            }
        }

        System.out.println("Goodbye, and have a wonderful day!");


    }

    private static HashMap<String, Student> getStringStudentHashMap() {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Alice", List.of(85, 90, 92));
        Student student2 = new Student("Bob", List.of(70, 75, 80));
        Student student3 = new Student("Charlie", List.of(88, 89, 93));
        Student student4 = new Student("Daisy", List.of(95, 96, 98));

        students.put("aliceGitHub", student1);
        students.put("bobOnGit", student2);
        students.put("charlie-coder", student3);
        students.put("daisyDev", student4);
        return students;
    }


}
