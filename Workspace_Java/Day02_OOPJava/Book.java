package Day2;

public class Book {

	private String title;
	private int price;
	static int bookCount;
	private static int totalNoOfBooks;
	
	static {
		int x=10;
		int y=90;
		int startWith=x+y;
		bookCount=startWith;
	}
	
	public static int getTotalNoOfBooks(){
		return totalNoOfBooks;
	}
	
	public Book() {
		title="Roman holiday";
		price=350;
		bookCount++;
		totalNoOfBooks++;
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
		bookCount++;
		totalNoOfBooks++;
	}
	
	public Book(int price, String title) {
		super();
		this.title = title;
		this.price = price;
		bookCount++;
		totalNoOfBooks++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
