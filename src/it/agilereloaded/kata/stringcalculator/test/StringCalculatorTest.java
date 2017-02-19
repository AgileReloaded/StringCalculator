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
	
	@Test
    public void givenCommaSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertEquals(7, strc.Add("4,1,2"));
    }
	
	@Test
    public void givenNewLineSeparatedNumbersShouldReturnTheirSum() throws Exception {
		assertEquals(13, strc.Add("10\n1\n2"));
    }
}
