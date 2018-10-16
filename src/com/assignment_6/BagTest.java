package com.assignment_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.*;
public class BagTest {

	Bag<String> b =new Bag<>();
    @Test
    public void repOk() {
        Bag<String> stringBag = new Bag<>();

        stringBag.insert("cat");
        stringBag.insert("cat");



    }
    @Test
    public void testInsert()
    {
    	b.insert("Chandler");
    	assertEquals("1",b.getValue("Chandler"));    	
    }
    @Test
    public void testRemove()
    {
    	b.remove("Chandler");
    	assertEquals("0",b.getValue("Chandler"));
    }
    
    @Test
    public void testisIn()
    {
        b.insert("Joey");
    	assertTrue(b.isIn("Joey"));
    }
    @Test
    public void testgetValue()
    {
    	
    	b.insert("Chandler");
    	assertEquals("1",b.getValue("Chandler"));
    }
    @Test
    public void testSize()
    {
    	assertEquals("2",b.size());
    }
}