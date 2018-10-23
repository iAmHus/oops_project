package com.assignment_7_old;

import java.util.*;

public class Indexer<E> {
	private List<Object> l= new ArrayList<>();       //Private List
	public Indexer(E c)                                   //Constructor
	{     
		l.addAll((Collection<? extends Object>) c);       //Copying the List or any other collection into private List field
	}
	public int size(Indexer<E> c)                             //Calculates the size of the collection  
	{
		Iterator<Object> it = l.iterator();
		int length =0;
		while(it.hasNext())
		{
			length++;
		}
		return length;
	}
	
	public E get(int i)               //Element at position i
	{
	  return (E)l.get(i);
	}
}
class ListIndexer extends Indexer{
	public ListIndexer(Object c) {
		super(c);
		
	}
	public static <E> int search(Indexer<E> c, E x)
	{
		Indexer<E> ll =new ListIndexer(c);
		int index=0;
		int s = ll.size(c);
		for(int i=0;i<s;i++)
		{
			if(ll.get(i).equals(x))
			{
				return i;
			}
		}
		throw new IllegalArgumentException("No Element Found");
		
	}
}


