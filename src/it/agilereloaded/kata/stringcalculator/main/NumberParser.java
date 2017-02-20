package it.agilereloaded.kata.stringcalculator.main;

public class NumberParser {

	String separators = ",|\n";

	public String[] ParseNumbers(String n) {
		if (n == null || n.isEmpty())
			return new String[0];

		if (thereAreCustomSeparator(n)) {
			separators += addCustomSeparatorToListOfSeparators(n);
			n = removeCustomSeparatorDefinitionFromInput(n);
		}
		return n.split(separators);
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