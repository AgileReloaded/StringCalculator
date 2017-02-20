package it.agilereloaded.kata.stringcalculator.main;

public class StringCalculator {
	
	String separators = ",|\n";

	public int Add(String n) {
		return sumOf(extractNumbersFrom(n));
	}

	private String[] extractNumbersFrom(String n) {
		String[] numbers = new String[0];
		if (n != null && !n.isEmpty()) {
			if (thereAreCustomSeparator(n))
			{
				addCustomSeparatorToListOfSeparators(n);
				n = removeCustomSeparatorDefinitionFromInput(n);
			}
			numbers = n.split(separators);
		}
		return numbers;
	}

	private String removeCustomSeparatorDefinitionFromInput(String n) {
		return n.substring(4);
	}

	private void addCustomSeparatorToListOfSeparators(String n) {
		separators += '|' + n.substring(2,3);
	}

	private boolean thereAreCustomSeparator(String n) {
		return n.startsWith("//");
	}

	private int sumOf(String[] numbers) {
		int sum = 0;
		for (String number : numbers)
			sum += Integer.parseInt(number);
		return sum;
	}

}
