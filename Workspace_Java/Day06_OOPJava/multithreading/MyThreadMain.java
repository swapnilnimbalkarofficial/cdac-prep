package multithreading;

public class MyThreadMain {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        String name = mainThread.getName();
        int priority = mainThread.getPriority();

        System.out.println(name);
        System.out.println(priority);

        Thread t1 = new MyThread("First");
        Thread t2 = new MyThread("Second");
        Thread t3 = new MyThread("Third");

        t1.start();
        t2.start();
        t3.start();
    }
}