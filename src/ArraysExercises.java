import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {
                new Person("Bob"),
                new Person("Marly"),
                new Person("Chuck"),
        };

        people = addPerson(people, new Person("Larry"));
        for (Person person : people){
            System.out.println(person.getName());
        }


    }

    private static Person[] addPerson(Person[] people, Person personToAdd){
        Person[] morePeople = Arrays.copyOf(people, people.length + 1);
        morePeople[morePeople.length - 1] = personToAdd;
        return morePeople;
    }

}
