package Day2;

public class ArraySimpleExample {

	public static void main(String[] args) {
		int[] numbers=new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		int arraySize=numbers.length;
		for(int index =0; index<arraySize; index++) {
			int number=numbers[index];
			System.out.println(number);
		}
		System.out.println("=========================================");
		
		for(int val: numbers) {
			System.out.println(val);
		}
	}

}
