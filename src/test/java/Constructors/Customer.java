package Constructors;

public class Customer {
    public String name;
    public int age;

    /*TODO
       Constructor--> a special method that is invoke every time an object is invoked.
       When we create object, constructor will be automatically called.
       Main purpose: to initialize instance variables.
       It has the same name as class name,
       It does not have return type: BUT...IQ
       Does constructor return anything?
       Both answers are right (said together)
       First of all, it cannot have return type.
       Second of all: it does return Object of the class,
       or return reference to the object from the class.
       Can have any access modifier.
       Constructors cannot be abstract, final, static or synchronized.

TODO   When you set a method as final it means: "I don't want any class to override it."
       But, according to the Java Language Specification:
      "Constructor declarations are not members.
       They are never inherited and therefore are not subject to hiding or overriding."

TODO   Constructors can’t be static because constructors in java are used
       to instantiate object and has access to instance variables, so what will be the use of
       a static constructor.

TODO   When you set a method as abstract it means:
       "This method doesn't have a body and it should be implemented in a child class."
       But the constructor is called implicitly and can't be overridden
       so what will you do with an abstract constructor.

TODO   Default constructor is provided by compiler if no other constructor created.
       If we created a constructor with parameters, default constructor will not be provided.

TODO   super() as well as this() both are used to make constructor calls.
       this() -->is used to call current class constructor.
       super() -->is used to call Parent class constructor.

todo    this.--> used to refer to current class instance
        super.--> used to access the fields and methods of parent class.

todo    super() has to be first inside child class constructor, before this().
        The parent class constructor needs to be called before the subclass constructor.
     */
    public Customer() {
        System.out.println("Default parent constructor is called");
    }

    public Customer(String name) {
        this();
        this.name = name;
        System.out.println("1 Parameterized parent constructor is called");
    }

    public Customer(String name, int age) {
        this(name);
        this.name = name;
        this.age = age;
        System.out.println("2 Parameterized parent constructor is called");
    }

    //parent method
    void display() {
        System.out.println("Parent class method");

    }

    public static void main(String[] args) {
//        Customer c1 = new Customer();
//        Customer c2 = new Customer("Mike");
//        Customer c3 = new Customer("John",
//                                   21);

        Account acc1 = new Account();
        acc1.display();
        Account acc2 = new Account("Bob", "Checking");
        acc2.printMsg();
    }
}

