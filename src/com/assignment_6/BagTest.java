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


    /**
     * Test properties rule.
     *
     * Validates the condition -
     * (continuing from the discussion in 7.11 - Liskov) - Is Bag a legitimate subtype of Set ?
     *
     * This is a test case that FAILS !!
     *                  - because the Bag allows duplicates - but LiskovGenericSet does NOT !
     *                  - This causes violation of the properties-rule (i.e.)
     *                          The super-type defines a property that is lost in its sub-type
     */
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

        // Attempting to remove the element -  the bag as it allows duplicates - does NOT completely remove the element
        //                                  -  while the set would completely removes the element
        stringBag.remove("bla-1");
        stringSet.remove("bla-1");

        assertFalse(stringSet.isIn("bla-1"));
        assertFalse(stringBag.isIn("bla-1"));
    }



}