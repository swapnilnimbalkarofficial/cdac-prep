package exception_handling;

public class ThrowsMain {
	private static void doTest()throws Exception{
	}
	private static void performTest() throws Exception {//called program
		
	}//throws run time exception
	private static void callPerformTest() throws Exception{//calling program
			performTest();
	}
	private static void callDoTest(){// throws Exception 
		try {
		doTest();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	private static void invokeDoTest() throws Exception {
		doTest();
		
	}

	public static void main(String[] args) {//do not add throws for main method main is entry point it is not recommended 
		
		callDoTest();
		try {
		invokeDoTest();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
