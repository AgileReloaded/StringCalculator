package it.agilereloaded.kata.stringcalculator.main;

public class StringCalculator {
	
	public int Add(String stringToSum) {
		String[] numbers = extractNumbersFrom(stringToSum);
		return sumOf(numbers);
	}

	private String[] extractNumbersFrom(String stringToSum) {
		return new NumberParser().ParseNumbers(stringToSum);
	}

	private int sumOf(String[] numbers) {
		int sum = 0;
		for (String number : numbers)
			sum += Integer.parseInt(number);
		return sum;
	}

}
