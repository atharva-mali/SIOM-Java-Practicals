/*
In Java, a class can inherit from only one superclass, which means Java supports single inheritance for classes. This design decision was made to simplify the language and avoid some of the complexities and ambiguities associated with multiple inheritance.

        However, Java provides an alternative mechanism to achieve some level of code reuse and abstraction using interfaces and composition. Interfaces in Java allow a class to declare a contract of methods that it promises to implement, and a class can implement multiple interfaces. This way, you can achieve something akin to multiple inheritances, though not in the same way as in languages that support true multiple inheritance.

Here's an example of how you can use interfaces to simulate multiple inheritance:
===========================================================================
 */

// Define two interfaces
interface A {
    void methodA();
}

interface B {
    void methodB();
}

// Implement both interfaces in a class
class MyClass implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Program12 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.methodA();
        myObject.methodB();
    }
}

/*
In this program, we have two interfaces, A and B, each declaring a single method. The MyClass class implements both interfaces and provides concrete implementations for the methods methodA and methodB. In the main method, we create an instance of MyClass and call both methods to demonstrate multiple inheritance through interfaces.
 */

