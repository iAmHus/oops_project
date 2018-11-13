package com.assignment_8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BoundedQueueTest {

	
	
    @Test
    public void testput() {
        BoundedQueue<String> bq = new BoundedQueue<>(5);
        bq.put("chandler");
        assertEquals(bq.get(),"chandler");
    }
    
    @Test
    public void testget() {
    	 BoundedQueue<String> bq = new BoundedQueue<>(5);
         bq.put("Monica");
         assertEquals(bq.get(),"Monica");
    }
    @Test
    public void testgetAll() {
    	 BoundedQueue<String> bq = new BoundedQueue<>(5);
    	 List<String> expected = Arrays.asList("Joey", "Chandler", "Monica");
    	 bq.put("Joey");
    	 bq.put("Chandler");
         bq.put("Monica");
        // BoundedQueue<String> bq1 = new BoundedQueue<>(5);
         assertEquals(expected, bq.getAll());
//         assertThat(bq.getAll(),expected);
    }
    @Test
    public void testputAll() {
    	BoundedQueue<String> bq = new BoundedQueue<>(3);
    	List<String> original =new ArrayList<>();
    	
    	original.add("Joey");
    	original.add("Chandler");
    	original.add("Monica");
    	bq.putAll(original);
    	System.out.println(original);
    	System.out.println(bq.getAll());
//    	assertEquals(original,bq.getAll());
    }
    
}
