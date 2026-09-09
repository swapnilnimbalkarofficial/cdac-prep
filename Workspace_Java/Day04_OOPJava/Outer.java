package Day4;

public class Outer {
	private int x=10;
	private static int y=20;
	
	public void showMessage() {
		//local class
		class Message{
			String getMessage(String name, String message) {
				return message+" "+name;
			}
			
		}
		Message msgObj=new Message();
		String greeting=msgObj.getMessage("James", "& Tema");
		System.out.println(greeting);
	}
	
	public static class StaticInner{//Outer$staticInner.class
		public void print() {
			//System.out.println(x);//x is non static 
			System.out.println("Y: "+y);
		}
	}
	
	public class Nested{
		public void display() {
			//it will take both x and y also static and non static 
			System.out.println("x= "+x);
			System.out.println("Y= "+y);
		}
	}
	
}
