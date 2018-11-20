package com.assignment_11;
import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class InstrumentedSetTests {

	@Test
	public void CollectionTest()
	{
	
	Collection<String> c2 = new LinkedList<String>();
	c2 = Arrays.asList("bee","ant");
	Collection<String> c1 = new InstrumentedSet<String>(c2);
	assertFalse(c2.equals(c1) && c1.equals(c2));
	 }
	
	public void ListTest()
	{
		List<String> c2 = new LinkedList<String>();
    	c2 = Arrays.asList("bee","ant");
    	Set <String> c1 = new InstrumentedSetList<String>(c2);
    	assertFalse(c2.equals(c1) && c1.equals(c2));
    	
	}
}
