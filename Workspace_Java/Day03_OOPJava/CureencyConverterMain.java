package Day3;

public class CureencyConverterMain {

	public static void main(String[] args) {
		System.out.println("Todays forex rate: ");
		System.out.println("USD=> INR: "+CurrencyConverter.DOLLAR_TO_RUPEE);
		//CurrencyConverter.DOLLAR_TO_RUPEE=100;
		CurrencyConverter forex; //static type of currency coverter
		forex = new DollerToRupeeConverter();
		float inr=forex.doConvert(5000);
		System.out.println("$5000 = Rs."+ inr);
		System.out.println("=================================");
		forex = new RupeeToPoundConverter();
		float gb=forex.doConvert(257500);
		System.out.println("Rs. 257500= GBP. "+gb);
	}

}
