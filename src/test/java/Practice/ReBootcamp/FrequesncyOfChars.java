package Practice.ReBootcamp;

public class FrequesncyOfChars {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("abbccckkkksssss"));
    }

    public static String frequencyOfChars(String str) {
        String nonDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDuplicate.contains("" + str.charAt(i))) {
                nonDuplicate += "" + str.charAt(i);
            }
        }
        //abcks
        String expectedResult = "";
        //for the outer loop it will loop 5 times
        //when is a --> it will go inside inner and count how many a's
        //then it goes to the outer becasue condition is false when meeting b
        //when it goes to b for outer, because i=1 now, b will be checked, and so on.
        for (int i = 0; i < nonDuplicate.length(); i++) {
            //I take a and check how many a's I have in the str
            //outer-->nonDup, inner--> str
            int count = 0;//count resets every iteration to zero
            for (int j = 0; j < str.length(); j++) {
                if (nonDuplicate.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDuplicate.charAt(i) + "" + count;
        }
        return expectedResult;
    }
}
