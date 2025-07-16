import java.util.Scanner;

public class ArmstrongRange {

    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int sum = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;

                int cube = 1;
                for (int i = 1; i <= 3; i++) {
                    cube *= digit;
                }

                sum += cube;
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        printArmstrongNumber(start, end);

        scanner.close();
    }
}
