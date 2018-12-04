package com.assignment_13;

import static org.junit.jupiter.api.Assertions.*;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

public class sampleTests {

    @Test 
    public void test1()
    {
    	calculator c = new calculator();
    	assertEquals(3,c.add(1, 2));
    }
    @Test
    public void test2()
    {
    	calculator c = new calculator();
    	assertEquals(5,c.add(3, 2));
    }
    @Test
    public void test3()
    {
    	calculator c = new calculator();
    	assertEquals(6,c.multiply(3, 2));
    }
    @Test
    public void test4()
    {
    	calculator c = new calculator();
    	assertEquals(20,c.multiply(10, 2));
    }
    @Test
    public void test5()
    {
    	calculator c = new calculator();
    	assertEquals(8,c.substract(10, 2));
    }
    @Test
    public void test6()
    {
    	calculator c = new calculator();
    	assertEquals(10,c.substract(7, 17));
    }
    @Test
    public void test7()
    {
    	calculator c = new calculator();
    	assertEquals(2,c.divide(10, 5));
    }
    @Test
    public void test8()
    {
    	calculator c = new calculator();
    	assertEquals(3,c.divide(12, 4));
    }
    
    
}
