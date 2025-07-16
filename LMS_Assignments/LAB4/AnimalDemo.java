import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Choose an animal:");
        System.out.println("1. Generic Animal");
        System.out.println("2. Dog");
        System.out.println("3. Cat");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                animal = new Animal();
                break;
            case 2:
                animal = new Dog();
                break;
            case 3:
                animal = new Cat();
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Animal.");
                animal = new Animal();
        }

        animal.makeSound();

        scanner.close();
    }
}
