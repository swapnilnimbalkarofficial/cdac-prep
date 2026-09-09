package exception_handling;

public class UserDefinedExceptionMain {

	public static void main(String[] args) {
		try {
			int position =NameCatalog.getPosition("Ram");
			System.out.println("position: "+ position);
		} catch (NameNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
