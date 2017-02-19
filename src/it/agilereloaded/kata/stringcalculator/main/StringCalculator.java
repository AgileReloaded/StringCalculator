package it.agilereloaded.kata.stringcalculator.main;

public class StringCalculator {

	public int Add(String n) {
		String[] numbers = extractNumbersFrom(n);
		return sumOf(numbers);
	}

	private String[] extractNumbersFrom(String n) {
		String[] numbers = new String[0];
		if (n != null && !n.isEmpty()) {
			numbers = n.split(",|\n");
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
