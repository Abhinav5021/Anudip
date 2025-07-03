abstract class Cons {
    abstract void run();

    Cons() {
        System.out.println("This is costructor");

    }

    abstract void fly();

}

class cot extends Cons {
    cot() {
        System.out.println("This is child class constructor");
    }

    @Override
    public void fly() {
        System.out.println("Fly in the sky");
    }

    @Override
    public void run() {
        System.out.println("run in the sky");
    }

}

public class ConstructorChaining {
    public static void main(String[] args) {
        cot c1 = new cot();
        c1.fly();
        c1.run();

    }
}
