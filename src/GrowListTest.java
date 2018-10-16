import com.assignment_5.GrowList;

import java.util.Iterator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GrowListTest {


    /**
     * Test iterable type. - Tests if the GrowList is of type iterable (i.e.) if it has an Iterator
     */
    @org.junit.Test
    public void testIterableType() {
        GrowList<String> gl1 = new GrowList();
        gl1.add("bing");
        gl1.add("chandler");

        assertTrue(gl1.iterator() instanceof  Iterator);
    }

    /**
     * Test has next - Tests the hasNext() functionality - returns true in case there is an element and returns false
     * after the end of the list is reached
     */
    @org.junit.Test
	public void testHasNext() {
		GrowList<String> gl = new GrowList();
		Iterator<String> it = gl.iterator();

		gl.add("bing");
		gl.add("chandler");
		assertTrue(it.hasNext());

		it.next();
		it.next();
		assertFalse(it.hasNext());
	}

    /**
     * Test next - Test if the next() function is working properly
     */
    @org.junit.Test
   public void testNext() {
    	GrowList<String> gl1 = new GrowList();
    	Iterator<String> it = gl1.iterator();
    	gl1.add("bing");
    	gl1.add("chandler");
    	assertEquals(it.next(),"bing");
    	assertEquals(it.next(),"chandler");
    }

    /**
     * Test remove - Tests the remove function - expects an Unsupported Exception - as Grow List is only supposed to grow
     */
    @org.junit.Test
	public void testRemove() {
        GrowList<String> gl1 = new GrowList();
        Iterator<String> it = gl1.iterator();
        gl1.add("bing");

        assertThrows(UnsupportedOperationException.class, ()-> it.remove());
	}


}
