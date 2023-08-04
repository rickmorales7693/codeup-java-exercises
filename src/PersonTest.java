public class PersonTest {
    public static void main(String[] args) {
        Person myPerson = new Person("Rick");
        Person person2 = new Person("Fred");
        System.out.println(myPerson.getName());
        System.out.println(person2.getName());

        myPerson.setName("Ricardo");
        System.out.println(myPerson.getName());

        myPerson.sayHello();
    }

}
