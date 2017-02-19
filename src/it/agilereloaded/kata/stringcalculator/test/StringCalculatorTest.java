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
}
