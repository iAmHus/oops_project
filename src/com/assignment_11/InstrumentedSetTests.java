package com.assignment_11;
import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class InstrumentedSetTests {

	@Test
	public void CollectionTest()
	{
	List<String> l = new LinkedList<String>();
	l = Arrays.asList("bee","ant");
	InstrumentedSet<String> c1 = new InstrumentedSet<String>(l);
	Set<String> s = new HashSet<String>();
	s.add("bee");s.add("ant");
	InstrumentedSet<String> c2 = new InstrumentedSet<String>(s);
	assertFalse(c1.equals(c2));
   }
	
	@Test
	public void ListTest()
	{
		List<String> c1 = new LinkedList<String>();
    	c1.add("bee");
    	c1.add("ant");
    	InstrumentedSetList <String> l = new InstrumentedSetList<String>(c1);
    	List<String> c2 = new LinkedList<String>();
    	c2.add("bee");
    	c2.add("ant");
    	InstrumentedSetList <String> l1 = new InstrumentedSetList<String>(c2);
    	assertTrue(l.equals(l1));
    	
	}
}
