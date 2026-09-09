package Day3;

public class PlayerMain {

	public static void main(String[] args) {
		CriketPlayer crPlayer=new CriketPlayer();
		crPlayer.setName("M S Dhoni");
		crPlayer.setAge(56);
		crPlayer.setRuns(10000);
		
		System.out.println(crPlayer.getName());
		System.out.println(crPlayer.getAge());
		System.out.println(crPlayer.getRuns());
		System.out.println("============================");
		CriketPlayer crPlayer2= new CriketPlayer("Virat Kohali", 40,25895);
		System.out.println(crPlayer2.getName());
		System.out.println(crPlayer2.getAge());
		System.out.println(crPlayer2.getRuns());
	}

}
