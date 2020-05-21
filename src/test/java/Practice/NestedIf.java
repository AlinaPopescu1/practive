package Practice;

public class NestedIf {
    public static void main(String[] args) {

        int num = 99;

        if (num > 50){
            System.out.println("1. Value of num is " +num);
            if( num > 50 ){
                System.out.println("2. Value of num is "+num);
            }
        }
    }
}
