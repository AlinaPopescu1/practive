package Practice.ReBootcamp;

public class CountLetters {
    public static void main(String[] args) {
        String str = "java";
        String check = "";
        for (int i = 0; i < str.length() ; i++) {
            //store them into check but don't count the a:2  2 times, continue will skip the iteration
            if(check.contains(str.charAt(i)+"")) continue;
            int count = 0;
            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)) count++;
            }
            System.out.println(count+":"+str.charAt(i));
            check += str.charAt(i);
        }
    }
}
