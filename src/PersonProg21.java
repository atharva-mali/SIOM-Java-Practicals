public class PersonProg21 {
    private String name;
    private int age;
    private String gender;

    // Constructor
    public PersonProg21(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        // Creating a Person object
        PersonProg21 person = new PersonProg21("John Doe", 30, "Male");

        // Getting and printing the person's details
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        // Updating the person's details
        person.setName("Jane Smith");
        person.setAge(25);
        person.setGender("Female");

        // Getting and printing the updated details
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Gender: " + person.getGender());
    }
}
