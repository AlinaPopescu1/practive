package Constructors;

public class Account extends Customer {

    String type;

    public Account() {
        /* Compiler implicitly adds super() here as the
         *  first statement of this constructor.
         */
        super();
        System.out.println("Default child constructor is called");
    }

    public Account(String name, String type) {
        /* Even though it is a parameterized constructor,
         * the compiler still adds the no-arg super() here
         */
        //super();
        super(name);
        super.name = name;
        this.type = type;
        System.out.println("2 Parameterized child constructor is called");

    }

    //overridden method
    @Override
    void display() {
        System.out.println("Child class method");
    }

    void printMsg() {
        //This would call overridden method, so this.display() works too
        this.display();
        //This would call parent method
        super.display();
    }

}
