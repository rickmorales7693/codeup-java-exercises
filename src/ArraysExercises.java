import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] person = {"Chuck", "Larry", "Moe"};
        System.out.println(Arrays.toString(person));
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);

        person = addPerson(person, "Curly");
        System.out.println(Arrays.toString(person));

    }

    public static String[] addPerson(String[] person, String personToAdd){
        String[] newArray = Arrays.copyOf(person, person.length + 1);
        newArray[newArray.length - 1] = personToAdd;
        return newArray;
    }

}
