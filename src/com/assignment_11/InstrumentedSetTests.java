package com.assignment_11;
import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

public class InstrumentedSetTests {

	@Test
	/* Replacing Sets with Collection
	 * Defining 2 InstrumentedSet objects of List and Set type with same elements [bee,ant].  'equals' contract of Collection mentions both the objects 
	 * of same type for equals method to compare. In this implementation, the equals contract gets violated as we use same InstrumentedSet object
	 * with List and Set type as both are subtypes for Collection and doesn't throw any compiler error.
	 * Therefore, this test case will be false 
	 */
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
	/*Replacing Sets with Lists.
	 * Defining 2 InstrumentedSetList objects of both LinkedList type with same elements [bee,ant]  
	 * Since the ForwardingList class implements List interface, the objects of InstrumentedSetList invoke the equals() function
	 * which does not break the contract of using List object.
	 */
	public void ListTest()
	{
		List<String> c1 = new LinkedList<String>();
    	c1.add("bee");
    	c1.add("ant");
    	InstrumentedSetList <String> l = new InstrumentedSetList<>(c1);
    	List<String> c2 = new LinkedList<String>();
    	c2.add("bee");
    	c2.add("ant");
    	InstrumentedSetList <String> l1 = new InstrumentedSetList<>(c2);
    	assertTrue(l.equals(l1));
    	
	}
	@Test
	/*Replacing Sets with Map.
	 * Defining 2 InstrumentedSetList objects of both HashMap type with same elements [bee,ant]  
	 * Since the ForwardingMap class implements Map interface, the objects of InstrumentedMap invoke the equals() function
	 * which does not break the contract of using Map objects.
	 */
	public void MapTest()
	{
		HashMap<Integer,String> c1 = new HashMap<Integer,String>();
		c1.put(1, "ant");
		c1.put(2,"bee");
		InstrumentedMap<Integer,String> m = new InstrumentedMap<>(c1);
		HashMap<Integer,String> c2 = new HashMap<Integer,String>();
		c2.put(1,"ant");
		c2.put(2,"bee");
		InstrumentedMap<Integer,String> m1 = new InstrumentedMap<>(c2);
		assertTrue(m.equals(m1));
	}
}
