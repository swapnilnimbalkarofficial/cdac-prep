package exception_handling;


public class CombineExceptionHandlerMain {

	public static void main(String[] args) {
		try {
			int p1= Integer.parseInt(args[0]);
			int p2=Integer.parseInt(args[1]);
			int result=p1/p2;
			System.out.println(result);
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Working but enter two number");
			}
			else {
				System.out.println("Enter a non zero value");
			}
		}
	}

}
