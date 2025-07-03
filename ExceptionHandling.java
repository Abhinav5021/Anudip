import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        boolean key = true;
        int a, b;
        Scanner sc = new Scanner(System.in);
        while (key) {
            System.out.print("Enter first number : ");
            a = sc.nextInt();
            System.out.print("Enter second number : ");
            b = sc.nextInt();
            System.out.println();
            try {
                System.out.println("Division of a and b are : " + (a / b));
                int arr[] = new int[5];
                arr[10] = 10; // ArrayIndexOutOfBoundsException
                System.out.println("Execution Successfull..!");
                key = false;
            } catch (ArithmeticException e) {
                System.out.println("Exception Occured... in Arithmetic : " + e.getMessage());
                System.out.println("Try Again ...!!");
                System.out.println();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception Occured... In Array : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Generalized Exception Occured..!! " + e.getMessage());
            } finally {
                System.out.println("Finally Block is Executed...!!");
            }
        }
    }
}
