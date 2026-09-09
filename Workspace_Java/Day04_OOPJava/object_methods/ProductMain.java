package object_methods;

public class ProductMain {

	public static void main(String[] args) {
		int val=100;
		System.out.println(val);
		Product p1= new Product("P101","1 tb hdd",1500);
		System.out.println(p1.getProduct());
		System.out.println(p1.getDescription());
		System.out.println("=========================");
		System.out.println(p1);//implicit call
		System.out.println(p1.toString());//explicit call
		
		System.out.println("======================");
		int val2=100;
		System.out.println(val==val2);
		System.out.println(p1.equals(val2));
		
		System.out.println("========================");
		Product p2= new Product("P101","1 tb hdd",1500);
		System.out.println(p1==p2);//non primitives
		System.out.println("========================");
		System.out.println(p1.equals(p2));
		
		Integer i=10;
		Float f=3.2f;
		Double d=4.5;
		int ii=i;
		
	}

}
