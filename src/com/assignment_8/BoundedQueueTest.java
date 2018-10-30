package com.assignment_8;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;


class BoundedQueueTest {

	
	
    @Test
    public void testput() {
        BoundedQueue<String> bq = new BoundedQueue<>();
        bq.put("chandler");
        assertEquals(bq.getE(),"chandler");
    }
    
    @Test
    public void testgetE() {
    	 BoundedQueue<String> bq = new BoundedQueue<>();
         bq.put("Monica");
         assertEquals(bq.getE(),"Monica");
    }
    @Test
    public void testgetAll() {
    	 BoundedQueue<String> bq = new BoundedQueue<>();
    	 List<String> expected = Arrays.asList("Joey", "Chandler", "Monica");
    	 bq.put("Joey");
    	 bq.put("Chandler");
         bq.put("Monica");
         BoundedQueue<String> bq1 = new BoundedQueue<>();
         //assertThat(bq.getAll(),expected);
    }
    
    
}
