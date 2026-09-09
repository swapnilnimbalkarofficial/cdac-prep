package exception_handling;

public class ThrowMain {
	private static int doDivide(int x, int y) {
		if(y==0) {//we are doing from developer side not coming picture in JRE
			RuntimeException rx=
					new RuntimeException("Unable to  Perform division");
			throw rx;
		}
		return x/y;
	}
	public static void main(String[] args) {
		try {
		System.out.println(doDivide(480, 80));
		System.out.println(doDivide(49, 7));
		System.out.println(doDivide(49, 0));
		}catch(RuntimeException e) {
			String errorMessage=e.getMessage();
			System.out.println("error ");
		}
	}

}
