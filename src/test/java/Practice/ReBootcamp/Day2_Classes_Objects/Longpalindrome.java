package Practice.ReBootcamp.Day2_Classes_Objects;

public class Longpalindrome {
    public static void main(String[] args) {
        System.out.println(longPalindrome(12321));

    }

    public static boolean longPalindrome(long longNum) {
        //create a um that will be manipulated
        long remain = longNum;//12321
        long reverse = 0;//

        while (remain != 0) {
            long digit = remain % 10;//get last digit//1
            //continuosly reverse the number
            reverse= reverse * 10 + digit;
            remain /= 10;

        }
//apapa
        ////branch change

        return longNum == reverse;

    }
}
