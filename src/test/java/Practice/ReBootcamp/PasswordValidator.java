package Practice.ReBootcamp;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "aV8!bdrgs2@knvs";

        boolean length = password.length()>=8;
        //.*[].* --> include anything or everything in this range
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@#$].*");

        boolean valid = length && lower && upper && number && special;
        if(valid){
            System.out.println(password+" is valid");
        }else {
            System.out.println(password + " is not valid");
        }
    }
}
