package Practice;
public class LargestNthArrayNum {
public static void sort(int [] array) {
    //Largest k element in array. k as index.
    int temp = 0;
    boolean check = true;

    while (check) {
        check = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                check = true;
            }

        }
    }
}
    public static int kthLargestArray(int[] nums, int k){
        sort(nums);
        int count = 1;
        int max = nums[0];
        int i = 1;
        while (count != k && i < nums.length) {
            if (nums[i] != max) {
                max = nums[i];
                count++;
            }
            i++;
        }
            if(count != k){
                return -1;
            }
            return nums[i-1];
        }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        System.out.println(kthLargestArray(nums, 2));
    }
}

