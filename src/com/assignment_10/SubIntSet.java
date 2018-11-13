package com.assignment_10;

import java.util.ArrayList;
import java.util.List;

public class SubIntSet extends IntSet {
	public List<Integer> els;
	private SubIntSet(List<Integer> list) 
	{ els = list; }
	public SubIntSet()
	{
		els = new ArrayList<Integer>(); 
	}
	public static void main(String[] args)
	{
		System.out.println("Sub Int Set");
	}
	
	@Override public boolean equals(Object obj) {  // Standard recipe
	      if (!(obj instanceof SubIntSet)) return false;

	      SubIntSet s = (SubIntSet) obj;
	      return this.els.equals(s.els);
	   }

	   @Override public int hashCode() { 
		   int result = 0;
			  for(Integer i : els)
				   result = result+i.hashCode();
		      return result;
	   }
}
