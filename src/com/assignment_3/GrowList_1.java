package com.assignment_3;

import java.util.*;
//  GrowList_1 is a mutable list that only gets longer.

// GitKraken Sample commit
public class GrowList_1<E> {

    private Map<Integer,E> values;

    // Changed the visibility of the constructor to private
    private GrowList_1() { values = new HashMap<Integer,E>();}

    // add to the end of the list

    // Writing a producer method - that imposes the immutability behavior

    public GrowList_1<E> add(E o) {

        GrowList_1 result = new GrowList_1();
        result.values.putAll(this.values);

        result.values.put(size(), o);

        return result;
//        values.put(size(), o);
    }

    // number of values in list
    public int size() { return values.size(); }

    // get ith value in list
    public E get(int i) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList_1.get");
        return values.get(i);
    }

    // update ith value in list;  return previous value or null if none
    public GrowList_1<E> set(int i, E o) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList_1.set");

        GrowList_1 result = new GrowList_1();
        result.values.putAll(this.values);

        result.values.put(i, o);

        return result;
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
        GrowList_1<String> list = new GrowList_1<String>();

        System.out.println("list is:" + list);
        list.add("cat");
        System.out.println("list is:" + list);
        list.add("dog");
        System.out.println("list is:" + list);
        list.set(1,"bat");
        System.out.println("list is:" + list);

    }
}
