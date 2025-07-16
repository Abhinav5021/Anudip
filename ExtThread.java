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

// 1. New State
// 2. Runnable State
// 3. Blocked State
// 4. Waiting State
// 5. Timed Waiting State
// 6. Terminated State