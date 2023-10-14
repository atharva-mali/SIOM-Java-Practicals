package mypackage;

import externalpackage.ExternalClass;

public class MyClass {
    private int myPrivateField = 42;

    void accessMembersOfExternalClass() {
        ExternalClass externalObj = new ExternalClass();
        System.out.println("Accessing members of ExternalClass:");
        System.out.println("ExternalClass's field: " + externalObj.externalField);
        externalObj.externalMethod();
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.accessMembersOfExternalClass();
    }
}
