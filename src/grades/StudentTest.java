package grades;

public class StudentTest {

    public static void main(String[] args) {
        // Create a new student
        Student student1 = new Student("John");
        student1.addGrade(90);
        student1.addGrade(85);
        student1.addGrade(88);
        System.out.println(student1.getName() + "'s Grade Average: " + student1.getGradeAverage());

        // Create another student
        Student student2 = new Student("Jane");
        student2.addGrade(95);
        student2.addGrade(78);
        System.out.println(student2.getName() + "'s Grade Average: " + student2.getGradeAverage());

    }



}
