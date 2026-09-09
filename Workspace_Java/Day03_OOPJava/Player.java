package Day3;

public class Player {
	private String name;
	private int age;
	
	public Player() {
		System.out.println("Inside player with empty ()");
	}
	
	public Player(String name, int age) {
		System.out.println("inside player(string, int)");
		this.name = name;
		this.age = age;
	}

	public Player(int age, String name) {
		System.out.println("inside player(int, string)");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
