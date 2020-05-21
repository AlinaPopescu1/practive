package Practice.ReBootcamp;

public class Task5 {
    public static void main(String[] args) {
        String str = "jav4ai158agre1at82";
        String numbers = "";//158
        int sum = 0;//4+158+1+82
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                numbers += str.charAt(i);
                //if next is not equal to a number, we need to convert sum into a number so it will take the 4 first
                //after that 4 is into sum, so we reset numbers to empty
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum +=Integer.parseInt(numbers);
                    numbers = "";
                }
            }
        }
        System.out.println(sum);
    }
}
