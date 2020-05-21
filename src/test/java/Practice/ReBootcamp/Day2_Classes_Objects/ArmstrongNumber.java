package Practice.ReBootcamp.Day2_Classes_Objects;

public class ArmstrongNumber {
    //153--> 1^3 + 5^3 + 3^3 =153
    // taking each digit raising to the power of the length and summing should be the num
    //For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.

    public static void main(String[] args) {
        System.out.println(armstrong(168));
    }
    public static boolean armstrong(int num) {
        //convert it to a string
        String number = String.valueOf(num);
        //raise it by the length(3)
        int power = number.length();
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            //take each number
            int digit = Integer.parseInt("" + number.charAt(i));
            //math class is doing the operation of power
            sum += Math.pow(digit, power);

        }
        return sum == num;
    }
    public static boolean armstrong2(int num){
        int digits = num;
        int sum = 0;
        int power = String.valueOf(num).length();
        //153-->read it from the end
        //num % 10 --> will give you the last digit
        while(digits != 0){
            int each = digits % 10;//3 is stored first
            //then remove the 3
            digits = digits/10;
            sum += Math.pow(each, power); //take the 3 and raise to the power//sum=27 first iteration
        }
        //if the sum is equal to our num, return the sum.
        //if the original is equal to the final return the value(true or false)
        return sum == num;
    }
}
