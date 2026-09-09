package multithreading;

public class CountDownThread extends Thread {
	public void run() {
		for(int count=10; count>=1; count--) {
			System.out.println("Tick Tick: "+count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
