package com.assignment_6;

import org.junit.Test;
import static org.junit.Assert.*;

public class BagTest {

    @Test
    public void repOk() {
        Bag<String> stringBag = new Bag<>();

        stringBag.insert("cat");
        stringBag.insert("dog");

        assertTrue(stringBag.repOk());
    }


    @Test
    public void testPropertiesRule() {
        Bag<String> stringBag = new Bag<>();
        LiskovGenericSet<String> stringSet = new LiskovGenericSet<>();

        //Adding an element to LiskovGenericSet & Bag
        stringSet.insert("bla-1");
        stringBag.insert("bla-1");

        //Adding the same element to LiskovGenericSet & Bag
        stringSet.insert("bla-1");
        stringBag.insert("bla-1");

        assertEquals(stringBag.size(), stringSet.size());




    }



}