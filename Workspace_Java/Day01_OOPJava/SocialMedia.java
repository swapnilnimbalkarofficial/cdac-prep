
public class SocialMedia {
	private String name;//private variable can access only in this class
	private int userCount;
	
	public void assignValues(String v_name, int v_count) {
		name=v_name;
		userCount=v_count;
	}
	
	public String retrievValues() {
		String data="Name: "+name+
				"User count: "+userCount;
		return data;
	}
}
