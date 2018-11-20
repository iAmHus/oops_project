package com.assignment_11;

import java.util.*;

public class InstrumentedSet<E> extends ForwardingCollection<E>{
	private int addCount = 0;
	public InstrumentedSet(Collection<E> s) {super(s);}
	@Override
	public boolean add(E e) {addCount++; return super.add(e);}
	public int getAddCount() {return addCount;}
 
}
