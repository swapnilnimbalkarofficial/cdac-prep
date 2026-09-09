package Day3;

public class OfflineTraining extends Training {
	private String venueDetails;

	public OfflineTraining() {
		
	}

	public OfflineTraining(String moduleName, int duration, String venueDetails) {
		super(moduleName, duration);
		this.venueDetails = venueDetails;
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
	//overriden method
	@Override
	public void conductTrainig() { 
		System.out.println("Conducting trianing module name"+getModuleName());
		System.out.println("Conducting trianing duration"+getDuration());
		System.out.println("at "+getVenueDetails());
	}
	@Override
	public String getDetails() {
		//extension by uisng super keyword
		String details=super.getDetails();
		return "Venue: "+venueDetails;
	}
	
}
