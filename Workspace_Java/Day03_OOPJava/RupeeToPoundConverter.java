package Day3;

public class RupeeToPoundConverter implements CurrencyConverter {

	@Override
	public float doConvert(float amountIndianRupees) {
		float amountInPounds=amountIndianRupees/POUND_TO_RUPEE;
		return amountInPounds;
	}

}
