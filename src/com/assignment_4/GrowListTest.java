package com.assignment_4;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GrowListTest {


    /**
     * testAdd - Add the value to the list - and checks
     *                                              - if the value is actually added.
     *                                              - if the set operation generated a new object - adhering to immutability principles
     */
    @org.junit.Test
    public void testAdd() {

        GrowList<String> list1 = new GrowList<>();

        list1.add("Sample1");

        
    }

    /**
     * testSet - Sets the value to the list - and checks
     *                                              - if the value is actually set.
     *                                              - if the set operation generated a new object - adhering to immutability principles
     */
    @org.junit.Test
    public void testSetWithFailingContract() {

        GrowList<String> list = new GrowList<>();

        list.add("First");

        list.setWithFailingContract(0,"Bla");

        assertEquals("Bla", list.get(0));

    }
    /**
     * testSet - Sets the value to the list - and checks
     *                                              - if the value is actually set.
     *                                              - if the set operation generated a new object - adhering to immutability principles
     */
    @org.junit.Test
    public void testSetWithFailingRepInvariant() {

        GrowList<String> list = new GrowList<>();

        list.add("First");

        list.setWithFailingRepInvariant(-4,"Bla");

        assertEquals("Bla", list.get(-4));
    }
}