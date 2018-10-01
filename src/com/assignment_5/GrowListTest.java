package com.assignment_5;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class GrowListTest {

	 @org.junit.Test
	public void hasNextTest() {
		//int c =0;
		GrowList<String> gl = new GrowList<String>();
		Iterator<String> it = gl.iterator();
		gl.add("bing");
		gl.add("chandler");
		assertEquals(it.hasNext(),"true");
	}
	 
    @org.junit.Test
   public void NextTest() {
    	GrowList<String> gl1 = new GrowList<String>();
    	Iterator<String> it = gl1.iterator();
    	gl1.add("bing");
    	gl1.add("chandler");
    	assertEquals(it.next(),"chandler");
    	
    }
	

}
