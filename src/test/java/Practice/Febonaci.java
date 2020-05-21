package Practice;

public class Febonaci {
    public static int getNthFiboNumber(int num) {
        //0,1,1,2,3,5,8,13,21,34.....
        int[] fiboNums = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < 2) {
                fiboNums[i] = i;
            } else {
                fiboNums[i] = fiboNums[i - 1] + fiboNums[i - 2];
            }
        }
        return fiboNums[num - 1];
        //num=5, give me index [4] so, index minus 1
    }

    public static void main(String[] args) {
        System.out.println(getNthFiboNumber(5));
    }
}
