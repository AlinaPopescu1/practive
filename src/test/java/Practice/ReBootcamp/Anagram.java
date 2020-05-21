package Practice.ReBootcamp;

public class Anagram {
    public static void main(String[] args) {
        //2 strings sharing the same chars
        //delete the second str and is is empty means all chars matches with 1st str
        String a = "listen";
        String b = "silent";

        a = a.toLowerCase().replace(" ", "");
        b = b.toLowerCase().replace(" ", "");

        if (a.length() != b.length()) {
            System.out.println("Not anagram");
            //stop the program
            System.exit(0);
        }
        for (int i = 0; i < a.length(); i++) {
            //remove the first instance of the 1st char
            b = b.replaceFirst(""+a.charAt(i), "");
        }
        if(b.isEmpty()){
            System.out.println(a+" is anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
