public class Loops {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + (i + 1));
        }

        // While loop
        int i = 0;
        while (i < 10) {
            System.out.println("While " + (i + 1));
            i++;
        }
        i = 0;
        do {
            System.out.println("do-While " + (i + 1));
            i++;
        } while (i < 10);
    }
}
