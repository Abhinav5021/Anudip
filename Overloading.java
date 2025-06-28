public class Overloading {
    void add(int a, int b) {
        System.out.println("int: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("double: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("int: " + (a + b + c));
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.add(5, 10);
        o.add(5.5, 10.5);
        o.add(5, 10, 15);
    }
}
