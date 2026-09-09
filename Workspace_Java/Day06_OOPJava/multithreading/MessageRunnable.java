package multithreading;

public class MessageRunnable implements Runnable{

	private String message;
	private int timeGap;
	public MessageRunnable(String message, int timeGap) {
		super();
		this.message = message;
		this.timeGap = timeGap;
	}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(message+": "+i);
			try {
				Thread.sleep(timeGap);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
