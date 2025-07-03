class Plane {
    public void fly() {
        System.out.println("Plane is flying");
    }
}

class PassangerPlane extends Plane {
    @Override
    public void fly() {
        super.fly();
        System.out.println("This is fly method of Passanger Plane");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        PassangerPlane pp = new PassangerPlane();
        pp.fly();
    }
}
