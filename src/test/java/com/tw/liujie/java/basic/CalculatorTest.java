package com.tw.liujie.java.basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator=new Calculator();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculateAdd() throws Exception {
        String expression="1+1.2";
        String result=calculator.calculate(expression);

        assertEquals("2.2",result);
    }
    @Test
    public void testCalculateSub() throws Exception {
        String expression="2.23-1";
        String result=calculator.calculate(expression);

        assertEquals("1.23",result);
    } 
    @Test
    public void testCalculateMultiple() throws Exception {
        String expression="1.2*1.2";
        String result=calculator.calculate(expression);

        assertEquals("1.44",result);
        
    }
    @Test
    public void testCalculateDivided() throws Exception {
        String expression="1.44/1.2";
        String result=calculator.calculate(expression);

        assertEquals("1.2",result);
    }
    @Test
    public void testCalculateComplex() throws Exception {
        String expression="1+1.2-1*1.2/1.0";
        String result=calculator.calculate(expression);

        assertEquals("1.44",result);
    }
}