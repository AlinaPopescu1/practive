package Practice;

public class Febonacci {
    public static void main(String[] args) {
        //give me the 6th feb number
        System.out.println(getNthFebonacci(6));
    }

    //0,1,1,2,3,5....
    //n=(n-2) + (n-1)
    public static int getNthFebonacci(int n) {
        int result;
        int previous = 0, current = 1, temp = 0;

        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
            for (int i = 0; i < n - 2; i++) {
                temp = previous + current;
                previous = current;
                current = temp;
            }
            result = current;
        }
        return result;
    }
}
