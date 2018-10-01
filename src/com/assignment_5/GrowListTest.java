package com.assignment_5;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;
public class GrowListTest {

	 @org.junit.Test
	public void hasNextTest() {
		GrowList<String> gl = new GrowList<String>();
		Iterator<String> it = gl.iterator();
		gl.add("bing");
		gl.add("chandler");
		assertTrue(it.hasNext());
	}
	 
    @org.junit.Test
   public void NextTest() {
    	GrowList<String> gl1 = new GrowList<String>();
    	Iterator<String> it = gl1.iterator();
    	gl1.add("bing");
    	gl1.add("chandler");
    	assertEquals(it.next(),"bing");
    }

    @org.junit.Test
	public void testRemove() {
        GrowList<String> gl1 = new GrowList<String>();
        Iterator<String> it = gl1.iterator();
        gl1.add("bing");

        assertThrows(UnsupportedOperationException.class, ()-> it.remove());
	}

}
