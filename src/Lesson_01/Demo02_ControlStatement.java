package Lesson_01;

import java.util.Scanner;

public class Demo02_ControlStatement {

    public static void example_01() {
        System.out.println("--- Compound Assigment Operator ---");
        System.out.printf("Please Input A : ");
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();

        byte totalWaterMelon = 0;
        totalWaterMelon += arithmetic_metod('+',a);
        totalWaterMelon += arithmetic_metod('-',a);
        totalWaterMelon += arithmetic_metod('*',a);
        totalWaterMelon += arithmetic_metod('/',a);
        totalWaterMelon += arithmetic_metod('%',a);

        System.out.println(String.format("You've Got %d / 5 WaterMelons !!!", totalWaterMelon));
        System.out.println("--- End of Demo02 Ex_01 ---");
    }

    private static byte arithmetic_metod(char ch, int a) {
        System.out.println("A is : " + a);
        System.out.printf("What is A %c 10 : ", ch);
        int ans;

        switch (ch) {
            case '+':
                ans = a + 10;
                break;
            case '-':
                ans = a - 10;
                break;
            case '*':
                ans = a * 10;
                break;
            case '/':
                ans = a / 10;
                break;
            case '%':
                ans = a % 10;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ch);
        }

        byte pt = 0;
        if (new Scanner(System.in).nextInt() == ans) {
            System.out.println("WaterMelon !!");
            pt = 1;
        } else
            System.out.println(String.format("Nope A %c 10 is %d",ch,ans));

        System.out.println("-----------------");
        return pt;
    }
}
