import java.util.*;

public class Employee {
    protected int id, age;
    protected String name;
    protected boolean isPermenent;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.println("Enter Employee Age: ");
        age = (int) sc.nextDouble();
        System.out.println("Is Employee Permanent? (true/false): ");
        isPermenent = sc.nextBoolean();

    }

    void Display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Emplyee is Permenent : " + isPermenent);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Successfully Started");
        emp.getData();
        emp.Display();
    }
}
