package Day2;

public class ArrayOperationMain {
	private static int[] getNameLengths(String[] namesCopy) {
		int size=namesCopy.length;
		int[] nameLengths=new int[size];
		int index=0;
		for(String name:namesCopy) {
			int currentLength=name.length();
			nameLengths[index]=currentLength;
			index++;
		}
		return nameLengths;
	}
	public static void main(String[] args) {
		String [] name= {"Swapnil", "Ram", "Prathamesh", "Shrikant", "Ajay", "Sanket", "Raj", "Abhishek"};
		
		int[] allLength=getNameLengths(name);
		for(int len: allLength) {
			System.out.println(len);
		}
		

	}

}
