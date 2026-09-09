package Day2;

public class CustomObjectArrayExampleMain {

	public static void main(String[] args) {
		Book[] bookStore=new Book[3];
		bookStore[0]=new Book();
		bookStore[1]=new Book("Harry poter",1243);
		bookStore[2]=new Book(743,"Rainy Days");
		
		for(Book currentBook: bookStore) {
			System.out.println(currentBook.getTitle().toUpperCase());
		}

	}

}
