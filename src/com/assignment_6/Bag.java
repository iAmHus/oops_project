package com.assignment_6;
import java.util.*;
public class Bag<E>
{
	private Map<E, Integer> map;

    public Bag() {
        map = new HashMap<E, Integer>();
    }

    // add 1 occurrence of e to this
    public void insert(E e) {
    	if(isIn(e))
    	{
    		int c = getValue(e);
    		map.put(e,c+1);
    	}
    }

    // remove 1 occurrence of e from this
    public void remove(E e) {
    	if(isIn(e))
    	{
    		map.remove(e);
    	}
    	else
    		throw new NoSuchElementException("element not found");
    }

    // return true iff e is in this
    public boolean isIn(E e) {
    	if(map.containsKey(e))
    		return true;
    	else
    		return false;
    }
    
    // return cardinality of this
    public int size() {
    	return map.size();
    }
   
    public int sizel(){
    	int l = 0;
    	Iterator itr =  map.iterator();
    	while(itr.hasNext())
    	{
    		l=l+1;
    	}
    	return l;
    }
    
    // if this is empty throw ISE
    // else return arbitrary element of this
    public E choose() {
    	
    	
    }
    public int getValue(E e)
    {
         if(isIn(e))
    	  {
           int i = Integer.parseInt(map.get(e).toString());
           return i;
    	  }
         else
        	 return 0;
    }
    // conveniently, the <E,Integer> map is exactly the abstract state
    public String toString() {
    	return map.toString(); 
    	}
}
