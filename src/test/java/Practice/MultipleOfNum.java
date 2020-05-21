package Practice;

import java.util.Arrays;

public class MultipleOfNum {
    /*
     Create a function that takes
     two numbers as arguments (num, length)
     and returns an array of multiples of num up to length.
     ex: arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
     */
    public static int[] nums(int num, int length) {
        int[] numbers = new int[length];
        int increase = 1;
        for (int i = 0; i < length; i++) {
            numbers[i] = num * increase;
            increase++;
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nums(7, 5)));
    }
}
