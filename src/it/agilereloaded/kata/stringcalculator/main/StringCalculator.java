package it.agilereloaded.kata.stringcalculator.main;

public class StringCalculator {

	public int Add(String n) {
		if(n == null || n.isEmpty()) 
			return 0;
		String[] numbers = n.split(",");
		
		int sum = 0;
		for(String number : numbers)
			sum += Integer.parseInt(number);
		return sum;
	}

}
