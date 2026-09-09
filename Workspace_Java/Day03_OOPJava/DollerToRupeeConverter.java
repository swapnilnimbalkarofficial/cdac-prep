package Day3;

public class DollerToRupeeConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountInUsDoller) {
		float amountInIndianRupees=amountInUsDoller*DOLLAR_TO_RUPEE;
		return amountInIndianRupees;
	}
	
}
