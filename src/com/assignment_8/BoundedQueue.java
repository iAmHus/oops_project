package com.assignment_8;
import java.util.List;
import java.util.ArrayList;

/**
 * The BoundedQueue 
 *
 * (i.e) It gives access to a method - that can act as an iterator
 *
 * Contributions:
 * *      - Shubham Pudi (G01087664)
 * *              - Implementation for the BoundedQueue methods
 * *              -count(), put(),get(), isFull(), isEmpty()
 * *      - Harisha Rajam Swaminathan(G01085509)
 * *              - Suggested more boundary scenarios that the code should cater to
 * *              - getAll(), putAll()
 *       - Murtuza Hussain Shareef(G01024452)
 *                - getAll() method implementation
 *                  Tested using Junit for different scenarios where          
 *  * *                  - positive flows were covered
 *  * *                  - exceptions were thrown
 * @param <E> the type parameter
 */
public class BoundedQueue <E>{
	private List<E> rep;
	private int size;
	public BoundedQueue(int length) {
		size = length;
		rep = new ArrayList<E>(length);
	}
	public int count()
	{
		int k =0;
		for(E i:rep)
		{
			if (i != null) {
				k++;
			}
		}
		return k;
	}
	public boolean isFull() {
		if(count() == size)
			return true;
		else
			return false;

	}
	public boolean isEmpty()
	{
		if(count()==0)
			return true;
		else
			return false;
	}
	public void put(E e)
	{
		if(e != null && !isFull() ) 
			rep.add(e);
		else
			throw new IllegalArgumentException("No element");

	}

	public int size()
	{
		return rep.size();
	}

	public E get() {
		if(!isEmpty())
		{
			E result = null;
			result = rep.get(0);
			rep.remove(0);
			return result;
		}
		else
			throw new IllegalArgumentException("No element");
	}

	public void putAll(List<E> al)
	{
		if(al.size()<=size())
			rep.addAll(al);
		else
			throw new IllegalArgumentException("Different size");
	}
	public List<E> getAll()
	{
		List<E> ll = new ArrayList<E>();
		ll.addAll(rep);
		rep.clear();
		return ll;
	}

	public boolean repOk() {
		
		for (E elem: rep) {
			if (elem == null) {
				return false;
			}
		} 
		
		if (count() > size) {
			return false;
		}
		
		return true;
		
	}

}


