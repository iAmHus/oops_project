package com.assignment_10;
import java.util.*;

/**
 * IntSet
 *
 *
 * Contributions:
 * *      - Shubham Pudi (G01087664)
 * *              - Implementation for the SubIntSet class 
 *                - hashcode() and equals() and clone()
 * *              
 * *      - Harisha Rajam Swaminathan(G01085509)
 * *              -Test cases for IntSet 
 *                -clone(), equals() for SubIntSet class
 * 
 *       - Murtuza Hussain Shareef(G01024452)
 *                - Changes made to correctly implement the clone() method in IntSet and 
 *                - Test cases for all the methods
 * @param <E> the type parameter
 * 
 * 
 * Story
 * We have inherited SubIntSet class from IntSet class which implements all the  functions of the super class
 * But the result for clone() methods gives an error as the super class IntSet has its own implementation to 
 * return a IntSet object which fails the clone() contract for SubIntSet instead to return a SubIntSet object
 * We have to override the clone() function to behave according to its own class.
 * 
 * Similarly, We had to override the equals() and hashcode() functions in the SubIntSet to behave according to the
 * object of its subtype and not depending on the SuperType implementation for the particular object
 * 
 * 
 */
public class IntSet implements Cloneable {  
	   private List<Integer> els;

	   @Override public boolean equals(Object obj) {  // Standard recipe
	      if (!(obj instanceof IntSet)) return false;

	      IntSet s = (IntSet) obj;
	      return false;
	   }

	   @Override public int hashCode() { 
	      // see below 
		  return 42;
	   }

	   public IntSet () { els = new ArrayList<Integer>(); }

	   private IntSet (List<Integer> list) { els = list; }

	   @Override public IntSet clone() { 
		   List<Integer> ll = new ArrayList<Integer>();
		   ll.addAll(this.els);
		   return new IntSet(ll);
	      //return new IntSet (new ArrayList<Integer>(els));
	   }
	}