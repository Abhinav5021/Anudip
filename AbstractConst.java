abstract class parent {
    parent() {
        System.out.println("Parent class constructor");
    }

    abstract void run();
}

class child extends parent {
    child() {
        System.out.println("This is child class constructor");
    }

    @Override
    void run() {
        System.out.println("Code is running ");
    }

    void Display() {
        System.out.println("Hello World..!! from child ");
    }
}

public class AbstractConst {
    public static void main(String[] args) {
        child c = new child();
        c.Display();
        c.run();
    }
}

// Constructor chaining is a concept used to call the abstract class constructor
// through child class constructor
// as we can not create object for abstract class so we have to extend it to the
// child class and then create object of
// child class to be able to successfully call the constructor of parent class.