package com.assignment_10;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SubIntSetTest {

	@Test
     public void cloneSubIntSetTest()
    {
	 SubIntSet s = new SubIntSet();
	 assertNotEquals(s.clone(),s);
    }

	@Test
	public void equalsTest()
	{
		SubIntSet s1 = new SubIntSet();
		s1.els.add(12);
		SubIntSet s2 = new SubIntSet();
		s2.els.add(12);
		assertTrue(s1.equals(s2));
	}
	@Test
	public void hashcodeTest()
	{
		SubIntSet s1 = new SubIntSet();
		s1.els.add(12);
		SubIntSet s2 = new SubIntSet();
		s2.els.add(12);
		assertEquals(s1.hashCode(),s2.hashCode());
	}
}
