import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Addition of Two Integers ===");
        System.out.print("Enter first integer: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int x2 = scanner.nextInt();
        int result1 = calc.add(x1, x2);
        System.out.println("Sum: " + result1);

        System.out.println("\n=== Addition of Three Integers ===");
        System.out.print("Enter first integer: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int y2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int y3 = scanner.nextInt();
        int result2 = calc.add(y1, y2, y3);
        System.out.println("Sum: " + result2);

        System.out.println("\n=== Addition of Two Doubles ===");
        System.out.print("Enter first double: ");
        double z1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double z2 = scanner.nextDouble();
        double result3 = calc.add(z1, z2);
        System.out.println("Sum: " + result3);

        scanner.close();
    }
}
