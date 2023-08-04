public class Person {
    private String name;

    /// Constructor
    public Person(String name) {
        this.name = name;
    }

    /// Getters and Setters
    public String getName(){
    //TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
    //TODO: change the name field to the passed value
        this.name = name;
    }

    /// Other Methods
    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello " + this.name);
    }



}
