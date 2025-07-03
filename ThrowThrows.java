
import java.util.*;

class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

public class ThrowThrows {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            age = sc.nextInt();
            if (age < 18) {
                throw new AgeInvalidException("You are not eligible to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        } catch (AgeInvalidException e) {
            System.out.println("Exception Occured ..!! : " + e.getMessage());
        }

    }
}
