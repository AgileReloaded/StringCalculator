package it.agilereloaded.kata.stringcalculator.main;

public class StringCalculator {
	
	String separators = ",|\n";

	public int Add(String n) {
		return sumOf(extractNumbersFrom(n));
	}

	private String[] extractNumbersFrom(String n) {
		String[] numbers = new String[0];
		if (n != null && !n.isEmpty()) {
			numbers = n.split(separators);
		}
		return numbers;
	}

	private int sumOf(String[] numbers) {
		int sum = 0;
		for (String number : numbers)
			sum += Integer.parseInt(number);
		return sum;
	}

}
