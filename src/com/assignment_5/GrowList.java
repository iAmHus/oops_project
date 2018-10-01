package com.assignment_5;
import java.util.*;
import java.util.Iterator;



public class GrowList <E> implements Iterable<E>{

	  private Map<Integer,E> values;

	  public GrowList() { values = new HashMap<Integer,E>();}
	 
	  // add to the end of the list
	  public void add(E o) {
	     values.put(size(), o);
	  }

	  // number of values in list
	  public int size() { return values.size(); }

	  // get ith value in list
	  public E get(int i) { 
	     if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
	     return values.get(i);
	  }

	  // update ith value in list;  return previous value or null if none
	  public E set(int i, E o) {
	     if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
	     return values.put(i, o);
	  }
	  
	  // private helper method
	  private boolean inRange(int i) { return (i >= 0) && (i < size()); }

	  public String toString() {
	      if (size() == 0) return "[]";
	      String result = "[";
	      for (int i = 0; i < size()-1; i++) {
	          result += values.get(i) + ",";
	      }
	      return result + values.get(size() - 1) + "]";
	  }

	  private class iterator implements Iterator<E>{
		  
		  int current = 0;
		  public boolean hasNext() {
			  if(current < values.size())
			  {
				  System.out.println("hasnext");
				  return true;
			  }
			  else
			  {
				  System.out.println("hasnextfalse");
			     return false;
			  }
		  }
		  public E next() {
			  if(!hasNext()) {
				  throw new NoSuchElementException();
			  }
			  else
			  {
				 System.out.println("next true"); 
				 return values.get(current++);
			  }
			  
		  }
	 }
	  public Iterator<E> iterator()
	  {
		  return new iterator();
	  }
	  public static void main(String[] args) {
	     GrowList<String> list = new GrowList<String>();

	     System.out.println("list is:" + list);
	     list.add("cat");
	     System.out.println("list is:" + list);
	     list.add("dog");
	     System.out.println("list is:" + list);
	     list.set(1,"bat");
	     System.out.println("list is:" + list);
	     for(String s: list)              //syntax question ??
	     {
	    	 System.out.println(s);
	     }

	  }
	}