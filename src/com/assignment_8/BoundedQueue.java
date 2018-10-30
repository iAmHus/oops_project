package com.assignment_8;
import java.util.List;
import java.util.ArrayList;

public class BoundedQueue <E>{
	private List<E> rep;
    public BoundedQueue() {
    	rep = new ArrayList<E>();
    }
 
    public void put(E e)
    {
    	if(e != null) {
    		rep.add(e);
    	}
    }
    public int size()
    {
    	int k =0;
    	for(E i:rep)
    	{
    	 k++;
    	}
    	return k;
    }
    public E getE() {
    	E result = null;
    	result = rep.get(0);
    	return result;
    }
    
    public void putAll(ArrayList<E> al)
    {
    	rep.addAll(al);
    }
    public List<E> getAll()
    {
    	List<E> ll = new ArrayList<E>();
    	ll.addAll(rep);
    	return ll;
    }
   
    
}


