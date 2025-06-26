import java.util.*;
public class Demo{

    static{
        System.out.println("Static block");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, "+name);
        sc.close();

    }
}
//Garbage collector frees the heap memory of the object which is not currently in use.
