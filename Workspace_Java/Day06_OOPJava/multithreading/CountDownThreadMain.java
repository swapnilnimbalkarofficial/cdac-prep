package multithreading;

public class CountDownThreadMain {

	public static void main(String[] args) {
		Thread count=new CountDownThread();//part of main thread
		System.out.println("Countdown begins...");
		count.start();
		try {
			count.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Countdown ends");//dontwait to count down ends 
		//main thread runs but child threads are available
	}

}
