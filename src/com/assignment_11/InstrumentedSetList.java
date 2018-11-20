package com.assignment_11;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class InstrumentedSetList<E> extends ForwardingList<E>{
	private int addCount = 0;
	public InstrumentedSetList(List<E> s) {super(s);}
	@Override
	public boolean add(E e) {addCount++; return super.add(e);}
	public int getAddCount() {return addCount;}
    public static void main(String[] args)
    {
    	List<String> c2 = new LinkedList<String>();
    	c2 = Arrays.asList("bee","ant");
    	Set <String> c1 = new InstrumentedSetList<String>(c2);
    	if(c1.equals(c2))
    	 System.out.println("equals");
    	else
    		System.out.println("not");
    }
}
