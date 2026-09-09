package Day2;

public class CarMain {

	public static void main(String[] args) {
		Car simpleCar, premiumCar;
		simpleCar=new Car();
		System.out.println(simpleCar.getDescription());
		System.out.println(simpleCar.getPrice());
		//explicit reference use this one 
		Engine simpleEngine=simpleCar.getEngineData();
		Engine simplePower=simpleCar.getPower();
		System.out.println(simplePower);
		//uising object graph navigation
		System.out.println(simpleCar.getEngineData().getPower());
		
		System.out.println("======================================");
		
		Engine premiumEngine=new Engine("Disel","3600 cc");
		MusicSystem premiumMusicSystem=
				new MusicSystem("Sony","Dolbey");
		premiumCar=new 
				Car("Toyota fortuner",2353352, premiumEngine, premiumMusicSystem);
		System.out.println(premiumCar.getDescription());
		System.out.println(premiumCar.getPrice());
		//print power
		System.out.println(premiumCar.getEngineData().getPower());
		//print sound effect for premium car
		//System.out.println(simpleCar.getMusicSystem().getSoundEffect());
		System.out.println(premiumCar.getMusicSystem().getSoundEffect());
		
		MusicSystem currentMusicSystem=simpleCar.getMusicSystem();
		if(currentMusicSystem !=null) {
			String currentSoundEffect=currentMusicSystem.getSoundEffect();
			System.out.println(currentSoundEffect);
		}
		else {
			System.out.println("This Car is does not have music system");
		}
	}

}
