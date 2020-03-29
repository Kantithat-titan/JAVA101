package Lesson_01;

import java.util.Scanner;

public class Demo01_Arithmetic {

    public static void basicMethod(){
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

    public static void incrementDecrementOperator(){
        System.out.println("--- Increment / Decrement Operator ---");
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please Input A : ");
        int a = keyboard.nextInt();

        System.out.printf("Please Input B : ");
        int b = keyboard.nextInt();

        System.out.printf("Please Input C : ");
        int c = keyboard.nextInt();

        System.out.println(String.format("A = %d, B = %d, C = %d", a, b, c));
        System.out.printf("What is A++ + --B + ++C : ");
        int ans = a++ + --b + ++c;
        int input = keyboard.nextInt();

        System.out.println(input == ans ? "WaterMelon!!" : "Answer is " + ans);
        System.out.println("-----------------");

        System.out.println(String.format("A = %d, B = %d, C = %d", a, b, c));
        System.out.printf("What is ++A + B-- - C++ : ");
        ans = ++a + b-- - c++;
        input = keyboard.nextInt();

        System.out.println(input == ans ? "WaterMelon!!" : "Answer is " + ans);
        System.out.println("-----------------");

        System.out.println(String.format("A = %d, B = %d, C = %d", a, b, c));
        System.out.printf("What is A++ + (--B * 2) + ++C : ");
        ans = a++ + (--b * 2) + ++c;
        input = keyboard.nextInt();

        System.out.println(input == ans ? "WaterMelon!!" : "Answer is " + ans);
        System.out.println("-----------------");


    }
}
