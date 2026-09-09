package Day4;

import Day3.CurrencyConverter;
import Day3.DollerToRupeeConverter;
import Day3.RupeeToPoundConverter;

public class OuterMain {

	public static void main(String[] args) {
//		StaticInner sta= new StaticInner();
		Outer.StaticInner staticInnerRef=new Outer.StaticInner();
		staticInnerRef.print();
		System.out.println("------------------------");
		Outer outerRef=new Outer();
		//Nested nestedRef=outerRef().new Nested();
		Outer.Nested nestedRef=outerRef.new Nested();
		nestedRef.display();
		System.out.println("--------------------------");
		outerRef.showMessage();
		System.out.println("==========================");
		//covert 10000 to inr
		CurrencyConverter forex;
		forex=new DollerToRupeeConverter();
		System.out.println(forex.doConvert(10000));
		System.out.println("------------------------------");
		forex= new RupeeToPoundConverter();
		System.out.println(forex.doConvert(100000));
		System.out.println("-------------------------------");
		//converting 5600 amountInKwatch to int
		//syntax
		forex=new CurrencyConverter() {
			
			@Override
			public float doConvert(float amountInKwatch) {
				// TODO Auto-generated method stub
				return amountInKwatch*4.95f;
			}
		};
		System.out.println(forex.doConvert(5000));
		
		System.out.println("==========================");
		
		//convert 50000 japnese
		forex=new CurrencyConverter() {
			
			@Override
			public float doConvert(float amountInYen) {
				// TODO Auto-generated method stub
				return amountInYen/1.78f;
			}
		};
		System.out.println(forex.doConvert(50000));
	}

}
