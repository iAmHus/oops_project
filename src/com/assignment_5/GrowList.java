package com.assignment_5;
import java.util.*;


public class GrowList<E> implements Iterable<E>{

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

	  private class Iterator implements java.util.Iterator<E> {
		  
		  int currentIdx ;

		  @Override
		  public boolean hasNext() {
			  if(currentIdx < values.size()) {
				  System.out.println("hasnext");
				  return true;
			  } else {
				  System.out.println("hasnextfalse");
			     return false;
			  }
		  }

		  @Override
		  public E next() {
			  if(!hasNext()) {
				  throw new NoSuchElementException();
			  } else {
				 System.out.println("next true"); 
				 return values.get(currentIdx++);
			  }
		  }

		  // Adjust the elements to cover the hole after removing the element
		  // current index  has to be adjusted as well
		  // An example from class that was used in Poly.java

//		  public void remove (int x) {
//			  //Modifies: this
//			  //Effects: Remove x from this
//			  int i = getIndex(new Integer(x));
//			  if (i < 0) return;
//			  els.set(i, els.lastElement());
//			  els.remove(els.size() - 1); }
//
		  @Override
		  public void remove() {
				throw new UnsupportedOperationException("Grow list can only grow, dude !");
		  }
	  }

	@Override
	public java.util.Iterator<E> iterator() {
		return new Iterator();
	}

	public static void main(String[] args) {
	     GrowList<String> list = new GrowList();

	     System.out.println("list is:" + list);
	     list.add("cat");
	     System.out.println("list is:" + list);
	     list.add("dog");
	     System.out.println("list is:" + list);
	     list.set(1,"bat");
	     System.out.println("list is:" + list);

//	     list.forEach(System.out::println);
//
//	     java.util.Iterator it = list.iterator();
//
//	     while(it.hasNext()) {
//	     	System.out.println(it.next());
//		 }

	     for(String s: list)              //syntax question ??
	     {
	    	 System.out.println(s);
	     }

	  }
	}