package Day2;

public class ParameterPassing {

	private static void changeAge(int ageCopy) {
		ageCopy=35;
		
	}
	
	private static void changeBook(Book myBookCopy) {
		myBookCopy.setTitle("black water");
		myBookCopy.setPrice(592);
	}
	public static void main(String[] args) {
		int age=24;
		System.out.println("Before change: "+age);
		
		changeAge(age);
		System.out.println("After change: "+age);
		
		System.out.println("---------------------------");
		
		Book myBook=new Book("Harry poter",1025);
		System.out.println("Book before change: ");
		System.out.println(myBook.getTitle());
		System.out.println(myBook.getPrice());
		changeBook(myBook);
		System.out.println("Book after change: ");
		System.out.println(myBook.getTitle());
		System.out.println(myBook.getPrice());
		
	}

}
