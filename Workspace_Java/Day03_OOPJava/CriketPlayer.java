package Day3;

public class CriketPlayer extends Player {

	private int runs;

	public CriketPlayer() {
		System.out.println("empty cosntructor in cricket player");
	}
	
	public CriketPlayer(String name, int age,int runs) {
		super(age,name);
		this.runs=runs;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
