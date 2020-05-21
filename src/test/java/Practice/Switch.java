package Practice;

public class Switch {
    public static void main(String[] args) {
    finraMultiBranch();
    ternaryFINRA();
    }
    /*
TODO
          Data types supported by switch statements include the following:
            *byte and Byte
            *short and Short
            *char and Character
            *int and Integer
            *String
            *enum values

TODO
          This is how it works:
          The switch expression is evaluated once.
          The value of the expression is compared with the values of each case.
          If there is a match, the associated block of code is executed.
          When Java reaches a break keyword, it breaks out of the switch block.
          This will stop the execution of more code and case testing inside the block.
          When a match is found, and the job is done, it's time for a break. There is no need for more testing.
          The default keyword specifies some code to run if there is no case match.

 TODO
          *break is used when you want to exit from the loop/switch statement,
          *while return is used to go back to the step where it was called or to stop further execution.


Todo
           When using SWITCH statement let’s not forget to use break statement
           for each case statement, otherwise it will keep executing code for cases below.

     */

    /*
    Write a method which prints out the numbers from 1 to 30 but:
 for numbers which are a multiple of 3 (divisible), print "FIN" instead of the number;
 for numbers which are a multiple of 5 (divisible), print "RA" instead of the number;
 for numbers which are a multiple of both 3 and 5 (divisible), print "FINRA" instead of the number.

     */

    public static void finraMultiBranch(){
        String result = "";

        for (int i = 1; i <= 30  ; i++) {

            if(i % 5 ==0 && i % 3 ==0)
                result += "FINRA ";
                else if (i % 5 == 0 )
                    result += "RA ";
                else if (i % 3 == 0)
                    result += "FIN ";
                else
                    result += i + " ";
            }
        System.out.println("result = " + result);
        }

/*
 TODO
      Syntax ternary:
                                  q mark            colon
            variable = (condition) ? expressionTrue : expressionFalse;

            */
        public static void ternaryFINRA(){
        String result = "";
            for (int i = 1; i <= 30 ; i++) {

                result += (i % 5 ==0 && i % 3 == 0) ? "FINRA " : (i % 5 == 0) ? "RA " : (i % 3 == 0) ? "FIN " : i + " ";

            }
            System.out.println("result = " + result);
        }
    }


