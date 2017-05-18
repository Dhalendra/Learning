package dc.learn.Testpack;

import java.util.*;
import java.text.*;

public class CurrencyFormatter {

	/**
	 * @param args
	 */
	// public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		Locale uslocale = new Locale.Builder().setLanguage("en")
				.setRegion("US").build();
		Locale inlocale = new Locale.Builder().setLanguage("en")
				.setRegion("IN").build();
		Locale chlocale = new Locale.Builder().setLanguage("zh")
				.setRegion("CN").build();
		Locale frlocale = new Locale.Builder().setLanguage("fr")
				.setRegion("FR").build();
		NumberFormat usformat = NumberFormat.getCurrencyInstance(uslocale);
		NumberFormat informat = NumberFormat.getCurrencyInstance(inlocale);
		NumberFormat chformat = NumberFormat.getCurrencyInstance(chlocale);
		NumberFormat frformat = NumberFormat.getCurrencyInstance(frlocale);

		System.out.println("US: " + usformat.format(payment));
		System.out.println("India: " + informat.format(payment));
		System.out.println("China: " + chformat.format(payment));
		System.out.println("France: " + frformat.format(payment));
	}
}
