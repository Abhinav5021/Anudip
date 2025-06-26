import java.util.*;

public class Day2 {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }

    Day2() {
        System.out.println("Welcome to Java.. constructor..!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day2 d = new Day2();

        System.out.println("Enter the values of A and B :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition is : " + d.add(a, b));
        System.out.println("Subtraction is : " + d.sub(a, b));
        System.out.println("Multiplication is :" + d.mul(a, b));
        System.out.println("Division is : " + d.div(a, b));

        sc.close();
    }
}
// variable in stack ( reference is on stack )
// instance in heap also object in heap memory

// Garbage collector clears the garbage form the Heap
// ( The objects which have no reference in stack is known as garbage)

// Ram {
// JRE{
// Code seg{}
// Static seg{}
// Stack seg{}
// Heap seg{}
// }
// }
