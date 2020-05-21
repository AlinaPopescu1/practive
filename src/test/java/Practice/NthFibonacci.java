package Practice;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        int a=0, b=0, c=1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times");
        int num = in.nextInt();
        System.out.println("Febonacci Serios of the number is: ");
        for (int i = 0; i <=num ; i++) {
            a=b;
            b=c;
            c=a+b;

            System.out.println(a + "");
        }
    }
}
