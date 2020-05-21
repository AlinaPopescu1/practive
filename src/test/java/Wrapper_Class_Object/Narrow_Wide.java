package Wrapper_Class_Object;

public class Narrow_Wide {
    public static void main(String[] args) {
        //widening casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double -->
        // implicit way --> assign a value of a smaller data type to a larger one.

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        //========================================================================
        int i = 100;
        long l = i; //no explicit type casting required
        float f = l;  //no explicit type casting required
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

        //narrowing casting
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble; // Manual casting: double to int
        // -->explicit way->assign a larger data type  value to a smaller data type.

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9
        //========================================================================
        double d = 100.04;
        long l1 = (long)d;  //explicit type casting required
        int i1 = (int)l; //explicit type casting required

        System.out.println("Double value "+d);
        System.out.println("Long value "+l1);
        System.out.println("Int value "+i1);

    }
}

