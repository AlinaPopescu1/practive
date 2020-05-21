package Practice;

public class NestedIfElse {
    public static void main(String[] args) {
    mySalary(120000, true);
    }


    public static void mySalary(int salary, boolean jobPostion) {

        if (salary > 100000) {
            System.out.println("I worked hard for this salary");
            if (!jobPostion) {
                System.out.println("I am a SDET");
            } else {
                System.out.println("I am a Scrum Master");
            }
        } else {
            System.out.println("It's OK for a start");
        }
    }
}
