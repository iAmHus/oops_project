package com.assignment_11;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;

/* 
* InstrumentedSetList class extending ForwardingList class which implements the Lists interface 
*   - Harisha Rajam Swaminathan(G01085509)
*  
*/

public class InstrumentedSetList<E> extends ForwardingList<E>{
	private int addCount = 0;
	public InstrumentedSetList(List<E> s) {super(s);}
	@Override
	public boolean add(E e) {addCount++; return super.add(e);}
	public int getAddCount() {return addCount;}
   
}
