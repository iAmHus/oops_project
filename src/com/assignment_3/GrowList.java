package com.assignment_3;

import java.util.*;
//  GrowList is a mutable list that only gets longer.
public class GrowList <E> {

    private Map<Integer,E> values;

    public GrowList() { values = new HashMap<Integer,E>();}

    // add to the end of the list
    // add becomes a producer as it returns a new state of the object
    public GrowList add(E o) {
    	GrowList gl = new GrowList <E>();
    	gl = (GrowList)values;
        gl.set(size()+1, o);
        return gl;
    }

    // number of values in list
    public int size() { return values.size(); }

    // get ith value in list
    // get is a observer
    public E get(int i) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
        return values.get(i);
    }

    // update ith value in list;  return previous value or null if none
    // set is also a mutator with producer
    public E set(int i, E o) {
       // if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
    	GrowList gl1 = new GrowList <E>();
    	gl1 = (GrowList)values;
        return (E) gl1.put(i, o);
    }
    
    private E put(int i, E o) {
		// TODO Auto-generated method stub
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

    public static void main(String[] args) {
        GrowList<String> list = new GrowList<String>();

        System.out.println("list is:" + list);
        list.add("cat");
        System.out.println("list is:" + list);
        list.add("dog");
        System.out.println("list is:" + list);
        list.set(1,"bat");
        System.out.println("list is:" + list);

    }
}
