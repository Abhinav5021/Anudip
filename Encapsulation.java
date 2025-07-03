class person {
    private String name;

    void setName(String s) {
        name = s;
    }

    void display() {
        System.out.println("Hello " + name);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Abhinav Pawar");
        p.display();
    }
}