package multithreading;

public class GreetingThreadMain {

	public static void main(String[] args) {
		Thread t= new GreetingThread();
		t.start();
		//t.run();
	}
}
