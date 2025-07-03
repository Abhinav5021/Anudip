interface Animal {
    void walk();

    static void sleep() {
        System.out.println("Animal is sleeping");
    }

    default void eat() {
        System.out.println("Default Animal is eating");
    }
}

class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        Animal.sleep();
        Dog dog = new Dog();
        dog.walk();
        dog.eat();
    }
}
