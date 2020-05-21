package Practice;

import java.util.Arrays;

public class subArrayLargest {
    public static void main(String[] args) {
        int[] arr = new int[] {5,5,1,2,10};
        System.out.println(Arrays.toString(largestArray(arr,3)));
    }
    /*
    write a function that will take int[] RR,
    int n as params and return subarray[n] with the largest sum

    subarray--> array inside our array, numbers should be consecutive
    Example inpput: arr[] {5,5,1,2,10}, 3
                       return {1, 2, 10}//output [1, 2, 10]
     */
    public static int[] largestArray(int[] arr, int subLength) {

        int[] subArray = new int[subLength];
        int[] result = new int[subLength];
        int sum, finalSum = 0;
        for (int i = 0; i <= arr.length - subLength; i ++) {//until 5-2, length=2
            sum = 0;//i need sum for each erray different so reset to 0
            for (int j = i, k = 0; j < i + subLength; j++, k++) {
                sum += arr[j];//calculate the sum
                subArray[k] = arr[j];//assign that sum to another array so-->
                // it can be changed every time
            }
            if (sum > finalSum) {
                finalSum = sum;
                //reassign the values from subArray to result array;
                for (int j = 0; j < subLength; j++) {
                    result[j] = subArray[j];

                }
            }
        }
        return result;
    }
}
