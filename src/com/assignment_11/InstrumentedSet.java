package com.assignment_11;

import java.util.*;

/**
 * 
 * InstrumentedSet class extending ForwardingCollection class which implements the Collection interface
 *   - Shubham Pudi (G01087664)
 *    Defining 2 InstrumentedSet objects of List and Set type with same elements [bee,ant].  'equals' contract of Collection mentions both the objects 
	 * of same type for equals method to compare. In this implementation, the equals contract gets violated as we use same InstrumentedSet object
	 * with List and Set type as both are subtypes for Collection and doesn't throw any compiler error.
	 * Therefore, this test case will be false 
	 *
 * 
 * 
 * InstrumentedSetList class extending ForwardingList class which implements the Lists interface 
 *   - Harisha Rajam Swaminathan(G01085509)
	 * Defining 2 InstrumentedSetList objects of both LinkedList type with same elements [bee,ant]  
	 * Since the ForwardingList class implements List interface, the objects of InstrumentedSetList invoke the equals() function
	 * which does not break the contract of using List object.
	 *
 *              
 * 
 * InstrumentedMap class extending ForwardingMap class which implements the Map interface
 *   - Murtuza Hussain Shareef(G01024452)
 *   * Defining 2 InstrumentedSetList objects of both HashMap type with same elements [bee,ant]  
	 * Since the ForwardingMap class implements Map interface, the objects of InstrumentedMap invoke the equals() function
	 * which does not break the contract of using Map objects.
	 *           
 * 
 */
public class InstrumentedSet<E> extends ForwardingCollection<E>{
	private int addCount = 0;
	public InstrumentedSet(Collection<E> s) {super(s);}
	@Override
	public boolean add(E e) {addCount++; return super.add(e);}
	public int getAddCount() {return addCount;}
 
}
