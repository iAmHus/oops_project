package com.assignment_4;
import java.util.*;
//  GrowList is a mutable list that only gets longer.
public class GrowList <E> {

    private Map<Integer,E> values;

    public GrowList() { values = new HashMap<Integer,E>();}

    // add to the end of the list
    public void add(E o) {
        values.put(size(), o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }
    }
    // add to the end of the list
    public void addWithFailingContract(E o) {
//        values.put(size(), o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }
    }
    // add to the end of the list
    public void addWithFailingRepOk(E o) {
        values.put(size(), o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }
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
        values.put(i, o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }

        return values.get(i);
    }
    // update ith value in list;  return previous value or null if none
    public E setWithFailingContract(int i, E o) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");

        // This line has been removed - as a SDL mutant would have
        // Now, the value is not set at the specified index - BREAKING THE CONTRACT !!!
        //values.put(i, o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }

        return values.get(i);
    }

    // update ith value in list;  return previous value or null if none
    public E setWithFailingRepInvariant(int i, E o) {

        // This line has been removed - as a SDL mutant would have
        // Now, that the check for proper range of index has been removed,
        // it is possible to set a value at an invalid index (i.e) index that did not already exist OR a negative index etc.

        // This is VIOLATING THE REP-INVARIANT!!!

        //        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");

        values.put(i, o);

        if (!repOk()) {
            throw new IllegalArgumentException("RepOk failed - Bad argument passed ! Please check and resend");
        }

        return values.get(i);
    }

    private boolean repOk() {

        for (Map.Entry<Integer, E> entry : this.values.entrySet()) {

            Integer key = entry.getKey();
            E elem = entry.getValue();

            if (key == null || !inRange(key) || elem == null) {
                return false;
            }
        }
        return true;
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