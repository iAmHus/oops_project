package com.assignment_6;

import java.util.*;

// See Liskov exercise 7.11
// This version is generified
public class Bag<E> {

    // rep: map each object to the count of that object in this
    // rep-inv:  range of map contains only positive integers
    // Example:  A bag of 2 cats and a dog is map = { cat=2, dog=1 }

    private Map<E, Integer> map;

    public Bag() {
        map = new HashMap<E, Integer>();
    }

    // add 1 occurrence of e to this
    public void insert(E e) {
        if (isIn(e)) {
            int c = getValue(e);
            map.put(e, c + 1);
        } else {
            map.put(e, 1);
        }
    }

    // remove 1 occurrence of e from this
    public void remove(E e) {
        if (isIn(e)) {
            map.put(e, map.get(e)-1);
        } else
            throw new NoSuchElementException("element not found");
    }

    // return true iff e is in this
    public boolean isIn(E e) {
        if (map.containsKey(e))
            return true;
        else
            return false;
    }

    // return cardinality of this
    public int size() {
        return map.size();
    }

    // if this is empty throw ISE
    // else return arbitrary element of this
    public E choose() throws IllegalStateException {

        if (size() <= 0) {
            throw new IllegalStateException("No elements to choose from");
        } else {
            return map.keySet().iterator().next();
        }
    }

    public int getValue(E e) {
        if (isIn(e)) {
            return map.get(e);
        } else {
            return 0;
        }
    }

    // conveniently, the <E,Integer> map is exactly the abstract state
    public boolean repOk() {
        boolean isRepInvalid = false;
        for (Integer i : map.values()) {
            if (i <= 0) {
                isRepInvalid = true;
                break;
            }
        }
        return !isRepInvalid;
    }

    // conveniently, the <E,Integer> map is exactly the abstract state
    public String toString() {
        return map.toString();
    }

}
