package multithreading;

public class MessageRunnableMain {

	public static void main(String[] args) {
		//it require more objects 
		Runnable t1=new MessageRunnable("Hello", 2000);//2sec
		Runnable t2=new MessageRunnable("Swapnil", 500);
		Thread t3=new Thread();//do not forget to pass target 
		Thread t4=new Thread();
		t3.start();
		t4.start();
	}

}
