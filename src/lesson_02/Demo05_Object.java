package lesson_02;

public class Demo05_Object {

    public static void animal(){
        Cat cat = new Cat();
        cat.AAAAA();
    }

    private static void testAnimal(){
        Animal animal = new Animal();
        animal.AAAAA();
        System.out.println("=========");
    }

    private static void testBird(){
        Bird bird = new Bird();
        bird.move();
        bird.breath();
        bird.eat();
        bird.reproduce();
        bird.sleep();
        System.out.println("=========");
    }

    private static void testCat(){
        LandAnimal cat = new LandAnimal();
        cat.move();
        cat.breath();
        cat.eat();
        cat.reproduce();
        cat.sleep();
        cat.AAAAA();
        System.out.println("=========");
    }



}
