import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GrowListTest {


    /**
     * testAdd - Add the value to the list - valid method
     *
     *                                              */
    @Test
    public void testAdd() {

        GrowList<String> list1 = new GrowList<>();

        list1.add("Sample1");

        assertEquals(1, list1.size());
        assertEquals("Sample1", list1.get(0));
    }

    /**
     * testAddWithFailingContract - Add the value to the list  (after SDL mutation)- and checks
     *                                              - if the value is actually added.
     *
     */
    @Test
    public void testAddWithFailingContract() {

        GrowList<String> list1 = new GrowList<>();

        list1.addWithFailingContract("Sample1");

        assertEquals(1, list1.size());
        assertEquals("Sample1", list1.get(0));
    }

    /**
     * testAddingWithFailingRepOk - Add the value to the list (after SDL mutation)- and checks
     *                                              - if the repOk is still valid
     *                                              - we added a null value and that fails the repOk check
     */
    @Test
    public void testAddingWithFailingRepOk() {

        GrowList<String> list1 = new GrowList<>();

        assertDoesNotThrow(() -> list1.addWithFailingRepOk(null));
    }


    /**
     * Test set. - test case for the valid set method
     */
    @Test
    public void testSet() {
        GrowList list = new GrowList();

        list.add("First");

        list.set(0,"bla");

        assertEquals("bla", list.get(0));
    }

    /**
     * testSet - Sets the value to the list (after SDL mutation)- and checks
     *                                              - if the value is actually set.
     *
     *           Adds a value and checks if the value can be over-ridden using the set method
     */
    @Test
    public void testSetWithFailingContract() {

        GrowList<String> list = new GrowList<>();

        list.add("First");

        list.setWithFailingContract(0,"Bla");
        assertEquals("Bla", list.get(0));
    }
    /**
     * testSetWithFailingRepInvariantForInvalidIndex (after SDL mutation)- Sets the value to the list - and checks
     *                                              - if the value is actually set.
     *
     *
     * Failing test case with a failing rep-invariant  - because the index check in rep-invariant fails
     */

    @Test
    public void testSetWithFailingRepInvariantForInvalidIndex() {

        GrowList<String> list = new GrowList<>();

        list.add("First");

        assertDoesNotThrow(() -> list.setWithFailingRepInvariant(-4,"Bla"));

        assertEquals("Bla", list.get(-4));
    }

    /**
     * testSetWithFailingRepInvariantForNullValue - Sets the value to the list (after SDL mutation) - and checks
     *                                              - if the value is actually set.
     *
     *
     * Failing test case with a failing rep-invariant  - because the value != null check in rep-invariant fails
     */

    @Test
    public void testSetWithFailingRepInvariantForNullValue() {

        GrowList<String> list = new GrowList<>();

        list.add("First");

        assertDoesNotThrow(() -> list.setWithFailingRepInvariant(1,null));
    }
}