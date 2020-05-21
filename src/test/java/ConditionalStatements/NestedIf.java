package ConditionalStatements;

public class NestedIf {
    public static void main(String[] args) {

        int num = 100;
        if (num <= 100){
            System.out.println("Value of num is "+num);
            if (num > 50){
                System.out.println("Value of num is "+num);
            }
        }
    }
}
