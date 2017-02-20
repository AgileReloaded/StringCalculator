package it.agilereloaded.kata.stringcalculator.main;

import java.util.LinkedList;
import java.util.List;

public class NumberParser {

	String separators = ",|\n";

	public List<Integer> ParseNumbers(String n) {
		List<Integer> numbers = new LinkedList<Integer>();

		if (n == null || n.isEmpty())
			return numbers;

		if (thereAreCustomSeparator(n)) {
			separators += addCustomSeparatorToListOfSeparators(n);
			n = removeCustomSeparatorDefinitionFromInput(n);
		}

		for (String num : n.split(separators)) {
			numbers.add(Integer.parseInt(num));
		}
		return numbers;
	}

	private boolean thereAreCustomSeparator(String n) {
		return n.startsWith("//");
	}

	private String addCustomSeparatorToListOfSeparators(String n) {
		return '|' + n.substring(2, 3);
	}

	private String removeCustomSeparatorDefinitionFromInput(String n) {
		return n.substring(4);
	}

}