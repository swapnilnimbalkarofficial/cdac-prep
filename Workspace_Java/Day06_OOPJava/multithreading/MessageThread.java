package multithreading;
//print the message 10 times gap between 2 message
public class MessageThread extends Thread {
	private String message;
	private int timeGap;
	public MessageThread(String message, int timeGap) {
		super();
		this.message = message;
		this.timeGap = timeGap;
	}
	public void run(){//we can not change static method from runnable class
		for(int i=1; i<=10; i++) {
			System.out.println(message+": "+i);
			try {
				Thread.sleep(timeGap);
			} catch (InterruptedException e) {
				e.printStackTrace();//is used to print stack trace
			}
		}
	}
}
