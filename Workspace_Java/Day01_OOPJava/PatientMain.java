
public class PatientMain {

	public static void main(String[] args) {
		Patient pt= new Patient();
		pt.setPatientId("01");
		pt.setName("Swapnil");
		pt.setBloodGroup("O+");
		pt.setHeight(170);
		pt.setWeight(56);
		pt.setDiabetic(false);
		
//		String ptId=pt.getPatientId();
		String ptName=pt.getName();
//		String ptBlood=pt.getBloodGroup();
//		int ptHeight=pt.getHeight();
//		float ptWeight=pt.getWeight();
		boolean ptDiabetic=pt.isDiabetic();

		if(ptDiabetic) {
			System.out.println("Hello"+ptName+"You need walking ");
		}
		else {
			System.out.println(ptName + " You are Sweet");
		}
		
	}

}
