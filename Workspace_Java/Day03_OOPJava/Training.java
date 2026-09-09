package Day3;

public class Training {

	private String moduleName;
	private int duration;
	public Training() {
		// TODO Auto-generated constructor stub
	}
	public Training(String moduleName, int duration) {
		super();
		this.moduleName = moduleName;
		this.duration = duration;
	}
	public Training(int duration,String moduleName) {
		super();
		this.duration = duration;
		this.moduleName = moduleName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	//empty implementation
	public void conductTrainig() { }
	
	public String getDetails() {
		String details="Module: "+moduleName+
				"\nDuration "+duration+" Days";
		return details;
	}

}
