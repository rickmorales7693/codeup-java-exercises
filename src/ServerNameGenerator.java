public class ServerNameGenerator {

    static String [] adjectives = {"happy", "sad", "angry", "tired", "hungry", "thirsty", "excited", "bored", "scared", "nervous"};

    static String [] nouns = {"dog", "cat", "bird", "fish", "horse", "cow", "pig", "chicken", "goat", "sheep"};
    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(randomElement(adjectives) + "-" + randomElement(nouns));

    }

    public static String randomElement(String[] array) {
        int randomIndex = (int) (Math.random() * array.length);
        return array[randomIndex];
    }



}
