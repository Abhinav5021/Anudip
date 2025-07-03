public class ExtThread extends Thread {

    @Override
    public void run() {
        System.out.println("This is a block inside Thread..");
    }

    public static void main(String[] args) {
        ExtThread thread = new ExtThread();
        thread.start();
        System.out.println("This is a block Outside Thread..");
    }

}
