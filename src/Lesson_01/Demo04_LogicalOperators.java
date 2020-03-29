package Lesson_01;

public class Demo04_LogicalOperators {

    public static void example_01(){
        Boolean a = true, b = false, c = null;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        System.out.println("A  && B : " + (a && b) );
        System.out.println("A  || B : " + (a && b) );
        System.out.println("!A && B : " + (!a && b) );
        System.out.println("A  || !B : " + (a && !b) );

        System.out.println("A & B & C: " + (a & b & c) );

    }
}
