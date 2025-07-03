abstract class Animal {
    abstract void walk();

    void eat() {
        System.out.println("Animal can eat");
    }

    abstract void run();
}

class Dog extends Animal {
    @Override
    void walk() {
        System.out.println("My extended Method");
    }

    @Override
    void run() {
        System.out.println("Dog can run");
    }
}

class Cat extends Animal {
    @Override
    void walk() {
        System.out.println("My extended Method");
    }

    @Override
    void run() {
        System.out.println("Cat Runs");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.walk();
        d.eat();
        d.run();
        Cat c = new Cat();
        c.walk();
        c.eat();
        c.run();

    }
}
