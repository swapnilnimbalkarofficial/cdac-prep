
public class WaterBottleMain {

	public static void main(String[] args) {
		WaterBottle smallBottle= new WaterBottle();
		WaterBottle medBottle= new WaterBottle();
		WaterBottle largeBottle= new WaterBottle();
		smallBottle.make="Bisleri";
		smallBottle.price=5.25f;
		smallBottle.volume=100;
		
		medBottle.make="Aqua";
		medBottle.price=9.50f;
		medBottle.volume=200;
		
		largeBottle.make="Baily";
		largeBottle.price=12.00f;
		largeBottle.volume=250;
		
		System.out.println("Small Bottle Details: ");
		System.out.println("Make: "+smallBottle.make);
		System.out.println("volume: "+smallBottle.volume);
		System.out.println("price: "+smallBottle.price);
		
		System.out.println("med Bottle Details: ");
		System.out.println("Make: "+medBottle.make);
		System.out.println("volume: "+medBottle.volume);
		System.out.println("price: "+medBottle.price);
		
		System.out.println("large Bottle Details: ");
		System.out.println("Make: "+largeBottle.make);
		System.out.println("volume: "+largeBottle.volume);
		System.out.println("price: "+largeBottle.price);
	}

}
