package Day2;

public class Car {

	//description,price,engine,music system
	private String description;
	private int price;
	private Engine engineData;
	private MusicSystem musicSystem;
	
	public Car() {
		description="Humdai Grand i10";
		price=65000;
		engineData=new Engine();
	
	}

	public Car(String description, int price, Engine engineData, MusicSystem musicSystem) {
		super();
		this.description = description;
		this.price = price;
		this.engineData = engineData;
		this.musicSystem = musicSystem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngineData() {
		return engineData;
	}

	public void setEngineData(Engine engineData) {
		this.engineData = engineData;
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	public Engine getPower() {
		// TODO Auto-generated method stub
		return engineData;
	}
	
	
}
