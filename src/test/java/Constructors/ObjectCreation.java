package Constructors;

public class ObjectCreation {
    public static void main(String[] args) {

//        Customer c1 = new Customer();
//        Customer c2 = new Customer("Mike");
//        Customer c3 = new Customer("John",
//                21);

        Account acc1 = new Account();
        acc1.display();
        Account acc2 = new Account("Bob", "Checking");
        acc2.printMsg();
    }
}
