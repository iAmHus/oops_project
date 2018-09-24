package com.assignment_3;

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
        GrowList<String> resultList;

        resultList = list1.add("Sample1");


        assertEquals(resultList.get(0), "Sample1");
        assertNotEquals(list1,resultList);

    }

    /**
     * testSet - Sets the value to the list - and checks
     *                                              - if the value is actually set.
     *                                              - if the set operation generated a new object - adhering to immutability principles
     */
    @org.junit.Test
    public void testSet() {

        GrowList<String> list1 = new GrowList<>();
        GrowList<String> listWithElement;
        listWithElement = list1.add("Cat");

        GrowList<String> resultList;
        resultList = listWithElement.set(0, "Dog");

        assertNotEquals(resultList, listWithElement);
        assertEquals(resultList.get(0), "Dog");

    }
}