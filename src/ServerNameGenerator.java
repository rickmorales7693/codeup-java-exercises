import java.util.Random;

public class ServerNameGenerator {

    private static String [] adjectives = {"happy", "sad", "angry", "tired", "hungry", "thirsty", "excited", "bored", "scared", "nervous"};

    private static String [] nouns = {"dog", "cat", "bird", "fish", "horse", "cow", "pig", "chicken", "goat", "sheep"};

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }

    public static String randomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        return array[randomIndex];
    }



}
