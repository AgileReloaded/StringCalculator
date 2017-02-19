package it.agilereloaded.kata.stringcalculator.main;

public class StringCalculator {

	public int Add(String n) {
		if(n == null || n.isEmpty()) 
			return 0;
		return Integer.parseInt(n);
	}

}
