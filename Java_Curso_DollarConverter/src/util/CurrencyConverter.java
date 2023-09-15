package util;

public class CurrencyConverter {
	//Método Estático (static)
	public static double Converter(double price_dollar, double dollar_amount){
		return (price_dollar * 1.06) * dollar_amount;
	}
}
