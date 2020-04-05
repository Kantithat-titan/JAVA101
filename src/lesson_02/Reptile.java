package lesson_02;

public class Reptile extends Animal {

    @Override
    public void breath() {
        System.out.println("I breathe With My Skin");
    }

    @Override
    public void move() {
        System.out.println("I Move Slower than LandAnimal");
    }
}
