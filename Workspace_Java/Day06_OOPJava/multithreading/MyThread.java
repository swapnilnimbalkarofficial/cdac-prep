package multithreading;

public class MyThread extends Thread {

    public MyThread(String threadName) {
        super(threadName);
    }

    public void run() {

        Thread currentlyRunningThread = Thread.currentThread();

        String name = currentlyRunningThread.getName();

        System.out.println(name + " My thread works....");
    }
}