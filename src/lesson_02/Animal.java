package lesson_02;

public class Animal {

    private String serialNumber;

    public void breath(){
        System.out.println("I don't know how to Breathe ??");
    }

    public void move(){
        System.out.println("I don't know how to Move ??");
    }

    public void eat(){
        System.out.println("I don't know how to Eat ??");
    }

    public void reproduce(){
        System.out.println("I don't know how to Reproduce ??");
    }

    public void sleep(){
        System.out.println("I don't know how to Sleep ??");
    }

    protected void AAAAA(){
        System.out.println("this protected AAAAA");

        System.out.println("Protected Method Call Private Method");
        this.thisIsPrivateMethod();
    }

    private void thisIsPrivateMethod(){
        System.out.println("This is Private Method Only For Animal Class");
    }
}
