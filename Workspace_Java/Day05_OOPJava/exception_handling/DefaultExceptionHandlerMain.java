package exception_handling;


public class DefaultExceptionHandlerMain {

	public static void main(String[] args) {
		try {
			int p1= Integer.parseInt(args[0]);
			int p2=Integer.parseInt(args[1]);
			int result=p1/p2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Working but enter two number");
		}
		catch(ArithmeticException e) {
			System.out.println("Do not divide by 0");
		}
		catch(Exception e) {
			System.out.println("General error");//generic type of e
		}
		
	}

}
