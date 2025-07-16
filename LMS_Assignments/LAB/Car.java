import java.util.Scanner;

public class Car {

    String make;
    String model;
    short year;
    int price;

    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("\n--- Car Information ---");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cars do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car #" + (i + 1));

            System.out.print("Enter make: ");
            String make = scanner.nextLine();

            System.out.print("Enter model: ");
            String model = scanner.nextLine();

            System.out.print("Enter year: ");
            short year = scanner.nextShort();

            System.out.print("Enter price: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            cars[i] = new Car(make, model, year, price);
        }

        System.out.println("\n========= Car Details =========");
        for (Car car : cars) {
            car.displayInfo();
        }

        scanner.close();
    }
}
