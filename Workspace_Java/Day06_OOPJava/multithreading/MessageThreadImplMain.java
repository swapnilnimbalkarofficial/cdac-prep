package multithreading;

public class MessageThreadImplMain {
	public static void main(String[] args) {
		Message msg= new Message("Welcome to synchronization");
		Thread t1=new MessageThreadImpl(msg,"**************");
		Thread t2= new MessageThreadImpl(msg,"#############");
		t1.start();
		t2.start();
	}
}
