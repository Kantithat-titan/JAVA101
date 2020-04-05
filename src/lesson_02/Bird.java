package lesson_02;

public class Bird extends Animal {

    private int wings;

    @Override
    public void breath() {
        super.breath();
    }

    @Override
    public void move() {
        System.out.println("I Move by Flying");
    }
}
