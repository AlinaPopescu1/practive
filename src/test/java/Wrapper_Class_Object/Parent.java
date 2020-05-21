package Wrapper_Class_Object;

public class Parent {
    public void display() {
        System.out.println("Parent class display() method called");
    }
}
 class Child extends Parent {
    public void display() {
        System.out.println("Child class display() method called");
    }
    public static void main(String args[]) {
        Parent p = new Child();
        Child c = (Child) p; // -->downcasting --> cast reference type to object type
        c.display();


    }
}

