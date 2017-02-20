package it.agilereloaded.kata.stringcalculator.main;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {
	
	public int Add(String stringToSum) throws IllegalArgumentException {
		String[] numbers = extractNumbersFrom(stringToSum);
		return sumOf(numbers);
	}

	private String[] extractNumbersFrom(String stringToSum) {
		return new NumberParser().ParseNumbers(stringToSum);
	}

	private int sumOf(String[] numbers) throws IllegalArgumentException {
		int sum = 0;
		List<Integer> negativeNumbers = new LinkedList<Integer>();
		for (String n : numbers)
		{
			int number = Integer.parseInt(n);
			if (number < 0)
				negativeNumbers.add(number);
			sum += number;
		}
		if (negativeNumbers.size() > 0)
			throw new IllegalArgumentException("Negatives numbers not allowed: " + negativeNumbers.toString());
		return sum;
	}

}
