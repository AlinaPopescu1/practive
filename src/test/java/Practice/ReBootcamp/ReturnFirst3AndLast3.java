package Practice.ReBootcamp;

public class ReturnFirst3AndLast3 {
    public static void main(String[] args) {
        //System.out.println(getChars("1234567"));
        System.out.println(getChars2("1234567"));
    }

    public static String getChars(String str) {
        String result;
        if (str.length() == 6)
            return str;

        result = str.substring(0, 3) + "" + str.substring(str.length() - 3);
        return result;
    }

    public static String getChars2(String str) {
        String result = "";
        if (str.length() == 6)
            return str;

        for (int i = 0; i < str.length(); i++) {
            result = str.substring(i, i + 3) + "" + str.substring(str.length() - (i + 3));
            break;
        }
        return result;
    }
}

