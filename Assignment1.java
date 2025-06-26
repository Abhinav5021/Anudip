import java.util.*;

public class Assignment1 {

    void greatest(int a, int b, int c) {
        if (a > b && b > c) {
            System.out.println(a + " is greatest ");
        } else if (b > a && b > c) {
            System.out.println(b + " is greatest ");
        } else {
            System.out.println(c + " is greatest ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment1 object = new Assignment1();
        boolean a = true;
        while (a) {
            System.out.println("Main Menu: ");
            System.out.println("1. Find Maximum of three numbers");
            System.out.println("2. Factorial of a number");
            System.out.println("3. Check Leap Year");
            System.out.println("4. Check Palindrome of String");
            System.out.println("5. Check Even or Odd");
            System.out.println("6. Exit");
            System.out.println("Select an option from Above : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter three numbers: ");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    int c1 = sc.nextInt();
                    object.greatest(a1, b1, c1);
                    break;

                case 2:
                    System.out.println("Enter a number: ");
                    int num = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of " + num + " is " + fact);
                    break;

                case 3:
                    System.out.println("Enter the year : ");
                    int year = sc.nextInt();
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }

                    break;

                case 4:
                    System.out.println("Enter a string to check if it is Palindrome : ");
                    String str = sc.next();
                    String rev = new StringBuilder(str).reverse().toString();
                    if (str.equals(rev)) {
                        System.out.println(str + " is a Palindrome");
                    } else {
                        System.out.println(str + " is not a Palindrome");
                    }
                    break;

                case 5:
                    System.out.println("Enter a number to check if it is Even or Odd : ");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0) {
                        System.out.println(num1 + " is Even");
                    } else {
                        System.out.println(num1 + " is Odd");
                    }
                    break;

                case 6:
                    a = false;
                    break;

            }

        }
    }
}
