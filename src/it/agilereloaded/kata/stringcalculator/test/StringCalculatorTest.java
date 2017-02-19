package it.agilereloaded.kata.stringcalculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.agilereloaded.kata.stringcalculator.main.StringCalculator;

public class StringCalculatorTest {

	StringCalculator strc = new StringCalculator();
	
	@Test
    public void givenEmptyStringShouldReturnZero() throws Exception {
        assertEquals(0, strc.Add(""));
    }
	
	@Test
    public void givenOneNumberShouldReturnItsValue() throws Exception {
        assertEquals(1, strc.Add("1"));
    }
	
	@Test
    public void givenTwoCommaSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertEquals(15, strc.Add("14,1"));
    }
}
