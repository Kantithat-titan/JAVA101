package Lesson_01;

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
}
