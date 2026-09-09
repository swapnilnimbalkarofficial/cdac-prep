package Day3;

public class OnlineTraining extends Training {
	private String meetingLink;

	public OnlineTraining() {
		
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	//overriden method
	@Override
	public void conductTrainig() {
		System.out.println("Conducting trianing module name"+getModuleName());
		System.out.println("Conducting trianing duration"+getDuration()+ "Days");
		System.out.println("at "+getMeetingLink());
	}
	@Override
	public String getDetails() {
		String details=super.getDetails();
		return "Meeting link: "+meetingLink;
	}
	
}
