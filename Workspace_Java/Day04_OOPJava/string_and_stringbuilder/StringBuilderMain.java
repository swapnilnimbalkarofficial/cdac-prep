package string_and_stringbuilder;

public class StringBuilderMain {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();//create empty builder
		sb.append("Current time is ");
		sb.append(5.25);
		sb.append(" pm. Today ");
		sb.append(4);
		sb.append(" topics are covered. Java is simple right? ");
		sb.append(true);
		System.out.println(sb);
		System.out.println("=====================================================");
		String finaldata=sb.toString();
		System.out.println(finaldata);
	}

}
