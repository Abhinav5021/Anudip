interface Animal {
    void walk();

    void run();

    void eat();
}

interface Cat1 {
    void cat1();
}

class Dog implements Animal, Cat1 {
    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void cat1() {
        System.out.println("Cat is doing cat1");
    }

}

class Cat implements Animal {
    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("");
        dog.walk();
        dog.run();
        dog.eat();
        System.out.println("");
        cat.walk();
        cat.run();
        cat.eat();
        System.out.println("");
    }
}
