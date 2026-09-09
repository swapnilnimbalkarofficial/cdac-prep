package Day3;

public class TrainingMain {

	public static void main(String[] args) {
		OfflineTraining offline=new OfflineTraining("OOP using java",9,"Met Nashik");
		OnlineTraining online=new OnlineTraining("SQL", 5,"https://meet.google");
		
		offline.conductTrainig();
		online.conductTrainig();
		
		System.out.println("===================");
//		Training trg=new OnlineTraining();//error
//		OfflineTraining offtrg=(OfflineTraining)offtrg;
//		offtrg.setVenueDetails("some thing new venu");
		
		
		System.out.println(offline.getDetails());
		System.out.println(online.getDetails());
	}

}
