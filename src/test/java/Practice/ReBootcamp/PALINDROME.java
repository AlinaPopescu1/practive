package Practice.ReBootcamp;

public class PALINDROME {
    public static void main(String[] args) {
        String str = "abcdcba";
        boolean check = true;
        //no need to reverse, shorter approach
        for (int i = 0; i < str.length() / 2; i++) {
            //if 1st is not equal to the last one we can stop
            //last index-->(str.length()-1) and -i to go reverse to check each char
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Palindrome" : "Not palindrome");
    }

}
