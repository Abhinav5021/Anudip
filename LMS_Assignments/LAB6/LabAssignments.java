// ----------------------- LAB 6.1: Vehicle Inheritance -----------------------
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

// ----------------------- LAB 6.2: Student Constructors -----------------------
class Student {
    String name;
    int age;
    String department;

    Student() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

// ----------------------- Main Class -----------------------
public class LabAssignments {
    public static void main(String[] args) {
        System.out.println("=== Lab 6.1: Vehicle Demo ===");

        Car car = new Car();
        Motorcycle bike = new Motorcycle();
        Garage garage = new Garage();

        System.out.println("Servicing car:");
        garage.serviceVehicle(car);

        System.out.println("\nServicing motorcycle:");
        garage.serviceVehicle(bike);

        System.out.println("\n=== Lab 6.2: Student Demo ===");

        Student s1 = new Student();
        Student s2 = new Student("Abhinav", 21);
        Student s3 = new Student("Sharad", 22, "Computer");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
