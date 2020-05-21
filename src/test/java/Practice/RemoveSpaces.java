package Practice;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Java      is     fun     ";
        System.out.println(removeSpaces(str));
    }

    public static String removeSpaces(String sentence){
        sentence = sentence.trim();
        do {
            sentence = sentence.replace("  ", " ");
        }while (sentence.contains("  "));
        return sentence;
    }
}
