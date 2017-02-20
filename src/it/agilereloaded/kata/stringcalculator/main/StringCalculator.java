package it.agilereloaded.kata.stringcalculator.main;

import java.util.LinkedList;
import java.util.List;

public class StringCalculator {

	public int Add(String stringToSum) throws IllegalArgumentException {
		List<Integer> numbers = extractNumbersFrom(stringToSum);
		checkForNegativesNumber(numbers);
		return sumOf(numbers);
	}

	private List<Integer> extractNumbersFrom(String stringToSum) {
		return new NumberParser().ParseNumbers(stringToSum);
	}

	private void checkForNegativesNumber(List<Integer> numbers) throws IllegalArgumentException {
		List<Integer> negativeNumbers = new LinkedList<Integer>();
		for (Integer number : numbers) {
			if (number < 0)
				negativeNumbers.add(number);
		}
		if (negativeNumbers.size() > 0)
			throw new IllegalArgumentException(negativeNumbers.toString());

	}

	private int sumOf(List<Integer> numbers) {
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		return sum;
	}

}
