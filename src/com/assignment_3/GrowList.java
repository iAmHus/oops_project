package com.assignment_3;

import java.util.HashMap;
import java.util.Map;
//  GrowList is a mutable list that only gets longer.


/**
 *  Contributions:
 *          *      - Murtuza Hussain Shareef(G01024452)
 *          *              - Implementation for the findPrimeFactor method
 *          *              - Top-level Javadoc and for all the utility methods involved
 *          *      - Harisha Rajam Swaminathan(G01085509)
 *          *              - Suggested more boundary scenarios that the code should cater to
 *          *              - JavaDoc for the findPrimeFactor method
 *          *      - Shubham Pudi (G01087664)
 *          *              Tested using Junit for different scenarios where
 *          *                  - positive flows were covered
 *          *                  - exceptions were thrown
 *          *
 *          *       In addition to this, every one contributed their ideas when collaborating and building the code together
 *
 * @param <E> the type parameter - to add to the list
 */
public class GrowList<E> {

    private Map<Integer, E> values;


    /**
     * Public constructor - that instantiates a new GrowList.
     *
     */
    public GrowList() {
        values = new HashMap<>();
    }

    /**
     * Private constructor - that instantiates a new GrowList AND adds the existing elements back to the new GrowList.
     *
     */
    private GrowList(Map<Integer, E> values) {
        this.values = new HashMap<>();
        this.values.putAll(values);
    }

    // add to the end of the list

    /**
     * Add grow list.
     *
     * @param o the element to be added to the list
     * @return the new list object created (including the element passed)
     */
// Writing a producer method - that imposes the immutability behavior
    public GrowList<E> add(E o) {

        GrowList result = new GrowList(this.values);

        result.values.put(size(), o);

        return result;
    }

    // number of values in list
    public int size() {
        return values.size();
    }

    // get ith value in list
    public E get(int i) {
        if (!inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
        return values.get(i);
    }

    /**
     * Set grow list.
     *
     * @param i the index to add the element to
     * @param o the element to add
     * @return the new list object created after addition of the new element
     */
// update ith value in list;  return previous value or null if none
    public GrowList<E> set(int i, E o) {
        if (!inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");

        GrowList result = new GrowList(this.values);

        result.values.put(i, o);

        return result;
    }

    // private helper method
    private boolean inRange(int i) {
        return (i >= 0) && (i < size());
    }

    public String toString() {
        if (size() == 0) return "[]";
        String result = "[";
        for (int i = 0; i < size() - 1; i++) {
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
        list.set(1, "bat");
        System.out.println("list is:" + list);

    }
}
