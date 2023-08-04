public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(returnName());

        String longerString = returnLongerString("Rick", "Morales");
        System.out.println(longerString);

        System.out.println(canBeHalved(4));

        System.out.println(sayName("Rick"));
        System.out.println(sayName("Rick", "Morales"));
    }

    public static String returnName() {
        return "Rick";
    }

    public static String returnLongerString(String str1, String str2){
//        if (str1.length() > str2.length()) {
//            return str1;
//        } else {
//            return str2;
//        }
        return (str1.length() >= str2.length()) ? str1 : str2;
    }

    public static boolean canBeHalved(int integer){
        return integer % 2 == 0;
    }

    public static String sayName(String firstName){
        return "Hi " + firstName;
    }

    public static String sayName(String firstName, String lastName){
        return "Hi " + firstName + " " + lastName;
    }



}
