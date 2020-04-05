package lesson_02;

public class LandAnimal extends Animal {

    @Override
    public void breath() {
        System.out.println("LandAnimal Breath by Nose");
    }

    @Override
    public void move() {
        System.out.println("LandAnimal Move By Legs");
    }

    @Override
    public void eat() {
        System.out.println("LandAnimal Eat By Mouth");
    }

    @Override
    public void reproduce() {
        System.out.println("LandAnimal Love My Family");
    }

    @Override
    public void sleep() {
        System.out.println("LandAnimal Sleep in the Evening");
    }
}
