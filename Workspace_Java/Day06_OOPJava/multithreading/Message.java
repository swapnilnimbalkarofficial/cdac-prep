package multithreading;
//object shared
public class Message {
	private String content;

	public Message(String content) {
		super();
		this.content = content;
	}
	
	public void printMessage(String decoration) throws InterruptedException {
		System.out.println(decoration);
		Thread.sleep(2000);
		System.out.println(content);
		Thread.sleep(2000);
		System.out.println(decoration);
		Thread.sleep(2000);
	}
}
