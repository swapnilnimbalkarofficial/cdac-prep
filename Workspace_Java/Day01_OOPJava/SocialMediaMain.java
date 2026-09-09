
public class SocialMediaMain {

	public static void main(String[] args) {
		SocialMedia fb= new SocialMedia();
		fb.assignValues("Facebook", 125);
		
		String fbDetails=fb.retrievValues();
		System.out.println(fbDetails);
		System.out.println("----------------");
		System.out.println(fb.retrievValues());
		
//		sb.name="Facebook";
//		System.out.println("Name: "+sb.name);
//		sb.userCount=150;
	}
	

}
