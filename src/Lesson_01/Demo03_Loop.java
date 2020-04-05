package Lesson_01;

import java.util.Scanner;

public class Demo03_Loop {

    public static void forLoop(){
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please Enter Total Number to Summarize : ");
        int count = keyboard.nextInt();

        int a, sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.printf("[%d] Please Input number :", i);
            a = keyboard.nextInt();

            sum += a;
        }

        System.out.println("===============");
        System.out.println("Summary is : " + sum);

        System.out.println("WaterMelon !!");
    }

    public static void whileLoop(){
        System.out.println("--- While Loop ---");
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please Input Your Score from 0 - 100 : ");
        int a = keyboard.nextInt();

        a = 95;
        // F || F == F
        while (a < 0 || a > 100) {
            System.out.println("You Input Wrong Number. Please Try Again");
            System.out.println("---------");
            System.out.printf("Please Input Your Score from 0 - 100 : ");
            a = keyboard.nextInt();
        }

        compareScoreToGrade(a);
        System.out.println("WaterMelon !! ");
    }

    public static void doWhileLoop(){
        System.out.println("--- Do While Loop ---");
        Scanner keyboard = new Scanner(System.in);
        int a = 0;
       do {
            System.out.printf("Please Input Your Score from 0 - 100 : ");
            a = keyboard.nextInt();

            if ( !(a >= 0 && a <= 100) ) {
                System.out.println("You Input Wrong Number. Please Try Again");
                System.out.println("---------");
            }
        } while (a < 0 || a > 100);

       compareScoreToGrade(a);
        System.out.println("WaterMelon !! ");
    }

    private static void compareScoreToGrade(int a) {
        System.out.println("Your Score : " + a);

        a = 82;
        int b = 37 ;

        if (a > b ) {
            System.out.println("You Got Grade A");
        } else if (a >= 78) {
            System.out.println("You Got Grade B+");
        } else if (a >= 73) {
            System.out.println("You Got Grade B");
        } else if (a >= 68) {
            System.out.println("You Got Grade C+");
        } else if (a >= 63) {
            System.out.println("You Got Grade C");
        } else if (a >= 58) {
            System.out.println("You Got Grade D+");
        } else if (a >= 50) {
            System.out.println("You Got Grade D");
        } else {
            System.out.println("You Got Grade F");
        }
    }

    public static void unlimitLoop(){
        int i = 0;
        while (true && i < 100){
            System.out.printf("%d WaterMelon !! \n", i);
            i ++;
        }
    }
}
