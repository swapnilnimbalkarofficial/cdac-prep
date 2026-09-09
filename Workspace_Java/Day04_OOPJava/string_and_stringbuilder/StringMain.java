package string_and_stringbuilder;

public class StringMain {

	public static void main(String[] args) {
		String greeting="Hello";
		System.out.println(greeting);
		greeting=greeting+"welcome";
		System.out.println(greeting);
		greeting=greeting+"Hi";
		System.out.println(greeting);
		greeting=greeting+"Bye";
		System.out.println(greeting);
		System.out.println("============================");
		StringBuilder sb= new StringBuilder("Hello");
		System.out.println(sb);
		StringBuilder sb1= new StringBuilder(sb+"Welcome");
		System.out.println(sb1);
	}

}
