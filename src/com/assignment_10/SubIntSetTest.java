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

class SubIntSetTest {

	@Test
     public void cloneSubIntSetTest()
    {
	 SubIntSet s = new SubIntSet();
	 assertEquals(s.clone(),s);
    }

	public void cloneIntSetTest()
	{
		IntSet i = new IntSet();
		assertEquals(i.clone(),i);
	}
}
