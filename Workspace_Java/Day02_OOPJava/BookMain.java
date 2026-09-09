package Day2;

public class BookMain {

	static {
		System.out.println("BookMain class is getting loaded...");
	}
	public static void main(String[] args) {
		//int val;
		//System.out.println(val);//local varibale does not intialize
		System.out.println("BookMain execution...");
		Book b1= new Book();
		Book b2= new Book("sunny Days",253);
		Book b3= new Book(428,"final designation");
		
		//give class name.member
		System.out.println("Curr No of books: "+Book.getTotalNoOfBooks());

		Book b4=new Book();
		Book b5=new Book();
		System.out.println("Curr No of books: "+Book.bookCount);

		for(int i=1; i<=10;i++) {
			new Book(); //creating new book evry time until10 
		}
		System.out.println("Curr No of books: "+Book.bookCount);

		
	}

}
