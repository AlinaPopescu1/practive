package Practice;

import java.util.Arrays;

public class Permutation {
    /*
     Given an array of 3 characters print all permutation combinations from the given characters.
      Character can NOT be repeated.
      1,2,3
      2,1,3 - valid
      1 1 2- not valid
      */
    public static void allPermutationsForthreeNums(int[] nums) {
        if (nums.length == 3) {
            int[] nums1 = new int[3];
            // form any combination of 3 numbers
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    for (int x = 0; x < nums.length; x++) {
                        if (i != x && i != j && j != x) {
                        nums1[0] = nums[i];
                        nums1[1] = nums[j];
                        nums1[2] = nums[x];
                        //check if its a valid combination, means each number does not have repeats in array
                            System.out.println(Arrays.toString(nums1));
                        }
                        //if combination is valid count always will be 3
                    }
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        allPermutationsForthreeNums(nums);
    }
}
