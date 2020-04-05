package Lesson_01;

public class Demo04_LogicalOperators {

    public static void example_01(){
        Boolean a = true, b = false, c = null;

        boolean x;  // ไม่มีการ initial ค่า default boolean == false
        boolean y = false;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        System.out.println("A  && B : " + (a && b));
        System.out.println("A  || B : " + (a || b));
        System.out.println("!A && B : " + (!a && b));
        System.out.println("A  || !B : " + (a || (!b)));


        /*
        * A = true
        * B = false
        *
        * !B = !false = true
        *
        * A || !B   => true || (!false)
        *           => true || true
        *           => true
        * */

//        System.out.println("A & B & C: " + (a & b & c) );


        if (false) {
            System.out.println("jkdsjkfjsdkf");
        } else {
            System.out.println("XXXXX");
        }

    }
}
