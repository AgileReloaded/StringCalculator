package it.agilereloaded.kata.stringcalculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.agilereloaded.kata.stringcalculator.main.StringCalculator;

public class StringCalculatorTest {

	private void assertSum(int expected, String input) {
		StringCalculator strc = new StringCalculator();
		int actual = strc.Add(input);
		assertEquals(expected, actual);
	}
	
	@Test
    public void givenEmptyStringShouldReturnZero() throws Exception {
		assertSum(0, "");
    }
	
	@Test
    public void givenOneNumberShouldReturnItsValue() throws Exception {
		assertSum(1, "1");
    }
	
	@Test
    public void givenTwoCommaSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertSum(15, "14,1");
    }
	
	@Test
    public void givenCommaSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertSum(7, "4,1,2");
    }
	
	@Test
    public void givenNewLineSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertSum(13, "10\n1\n2");
    }
	
	@Test
    public void givenMixedNewLineAndCommaSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertSum(13, "10\n1,2");
    }
	
	@Test
    public void allowCustomSeparatorDefinitionInTheFirstLineOfInput() throws Exception {
		assertSum(17, "//;\n7;4;6");
    }

}
