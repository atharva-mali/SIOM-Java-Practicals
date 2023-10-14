class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study(String subject) {
        String name = null;
        System.out.println(name + " with student ID " + studentId + " is studying " + subject + ".");
    }
}

class Teacher extends Person {
    private String employeeId;

    public Teacher(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void teach(String subject) {
        String name = null;
        System.out.println(name + " with employee ID " + employeeId + " is teaching " + subject + ".");
    }
}

public class Program20 {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.introduce();

        Student student = new Student("Alice", 20, "S12345");
        student.introduce();
        student.study("Mathematics");

        Teacher teacher = new Teacher("Mr. Smith", 40, "T9876");
        teacher.introduce();
        teacher.teach("History");
    }
}
