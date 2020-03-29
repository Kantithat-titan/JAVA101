package Lesson_01;

import java.util.Scanner;

public class Demo01_Arithmetic {

    public static void main(String[] args) {

        boolean isDrivable = true;

        char ch = 'A';

        byte byteVal;

        short shortVal;

        int intValue;

        long longNumber;

        float floatNumber;

        double doubleNumber;

        // Arithmetic

        int a = 23;

        // Addition
        System.out.println("Addition");
        System.out.println("a + 10 = " + (a + 10) );
        System.out.println("----------");

        // Subtraction
        System.out.println("Subtraction");
        System.out.println("a - 10 = " + (a - 10) );
        System.out.println("----------");

        // Multiplication
        System.out.println("Multiplication");
        System.out.println("a * 10 = " + (a * 10) );
        System.out.println("----------");

        // Division
        System.out.println("Division");
        System.out.println("a / 10 = " + (a / 10) );
        System.out.println("----------");

        // Remainder (mod)
        System.out.println("Remainder (mod)");
        System.out.println("a % 10 = " + (a % 10) );
        System.out.println("----------");

        // ------------------ Compound Assigment Operators --------------------

        int b = 0;

        b = b + 25;
        System.out.println("b + 25 -> " + b );

        b += 25;
        System.out.println("b += 25 -> " + b );
        System.out.println("----------");

        int c = 101;
        System.out.println("101 % 25 -> " + (101 % 25));

        c %= 25;
        System.out.println("c %= 25 -> " + c);
        System.out.println("----------");

        // ------------------ Increment / Decrement Operators --------------------

        int m = 1, n = 3, o = 5;

        int x = m++ + n++ + ++o;    // 1 + 3 + 6
        System.out.println("x = " + x);

        x = m+=3 + ++n - o++;       // 5 + 5 - 6
        System.out.println("x = " + x);

    }

    public static void ex_01(){
        System.out.println("--- Basic Operator ---");
        System.out.printf("Please Input A : ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();

        byte totalWaterMelon = 0;
        totalWaterMelon += additional_method(a);
        totalWaterMelon += subtraction_method(a);
        totalWaterMelon += multiplication_method(a);
        totalWaterMelon += devision_method(a);
        totalWaterMelon += remainder_method(a);

        System.out.println(String.format("You've Got %d / 5 WaterMelons !!!", totalWaterMelon));
        System.out.println("--- End of Demo01_Example 01 ---");
    }

    private static byte additional_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A + 10 : ");
        int ans = a + 10;

        byte pt = 0;
        if (new Scanner(System.in).nextInt() == ans) {
            System.out.println("WaterMelon !!");
            pt = 1;
        } else
            System.out.println("Nope A + 10 is " + ans);

        System.out.println("-----------------");
        return pt;
    }

    private static byte subtraction_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A - 10 : ");
        int ans = a - 10;

        byte pt = 0;
        if (new Scanner(System.in).nextInt() == ans) {
            System.out.println("WaterMelon !!");
            pt = 1;
        } else
            System.out.println("Nope A - 10 is " + ans);

        System.out.println("-----------------");
        return pt;
    }

    private static byte multiplication_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A * 10 : ");
        int ans = a * 10;

        byte pt = 0;
        if (new Scanner(System.in).nextInt() == ans) {
            System.out.println("WaterMelon !!");
            pt = 1;
        } else
            System.out.println("Nope A * 10 is " + ans);

        System.out.println("-----------------");
        return pt;
    }

    private static byte devision_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A / 10 : ");
        int ans = a / 10;

        byte pt = 0;
        if (new Scanner(System.in).nextInt() == ans) {
            System.out.println("WaterMelon !!");
            pt = 1;
        } else
            System.out.println("Nope A / 10 is " + ans);

        System.out.println("-----------------");
        return pt;
    }

    private static byte remainder_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A %% 10 : ");
        int ans = a % 10;

        byte pt = 0;
        if (new Scanner(System.in).nextInt() == ans) {
            System.out.println("WaterMelon !!");
            pt = 1;
        } else
            System.out.println("Nope A %% 10 is " + ans);

        System.out.println("-----------------");
        return pt;
    }

    public static void compoundAssignmentOperator(){
        System.out.println("--- Compound Assigment Operator ---");
        System.out.printf("Please Input A : ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int final_num = (((a+5-10)*2)/10)%2;
        a = compound_add_method(a);
        a = compound_minus_method(a);
        a = compound_multiple_method(a);
        a = compound_division_method(a);
        a = compound_remainder_method(a);

        System.out.println("Your answer is " + a);
        System.out.println(a == final_num ? "WaterMelon !!!" : "Please Try Again Buddy");
    }

    private static int compound_add_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A += 5 : ");
        a += 5;

        if (new Scanner(System.in).nextInt() == a)
            System.out.println("WaterMelon !!");
        else
            System.out.println("Nope A += 5 : " + a);

        System.out.println("-----------------");
        return a;
    }

    private static int compound_minus_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A -= 10 : ");
        a -= 10;

        if (new Scanner(System.in).nextInt() == a)
            System.out.println("WaterMelon !!");
        else
            System.out.println("Nope A -= 10 : " + a);

        System.out.println("-----------------");
        return a;
    }

    private static int compound_multiple_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A *= 2 : ");
        a *= 2;

        if (new Scanner(System.in).nextInt() == a)
            System.out.println("WaterMelon !!");
        else
            System.out.println("Nope A *= 2 : " + a);

        System.out.println("-----------------");
        return a;
    }

    private static int compound_division_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A /= 10 : ");
        a /= 10;

        if (new Scanner(System.in).nextInt() == a)
            System.out.println("WaterMelon !!");
        else
            System.out.println("Nope A /= 10 : " + a);

        System.out.println("-----------------");
        return a;
    }

    private static int compound_remainder_method(int a){
        System.out.println("A is : " + a);
        System.out.printf("What is A %%= 2 : ");
        a %= 2;

        if (new Scanner(System.in).nextInt() == a)
            System.out.println("WaterMelon !!");
        else
            System.out.println("Nope A %%= 2 : " + a);

        System.out.println("-----------------");
        return a;
    }

}
