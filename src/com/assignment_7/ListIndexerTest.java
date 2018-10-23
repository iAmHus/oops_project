package com.assignment_7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListIndexerTest {

    @Test
    public void testPositiveCase() {

        List<String> list = new ArrayList<>();
        list.add("aba");
        list.add("bla");
        list.add("cla");

        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertEquals(Indexer.search(listIndexer, "bla"),1);
    }
    @Test
    public void testCaseWhenElemNotPresent() {

        List<String> list = new ArrayList<>();
        list.add("aba");
        list.add("bla");
        list.add("cla");

        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertThrows(NoSuchElementException.class, ()-> Indexer.search(listIndexer, "aaaaa"));
    }

    @Test
    public void testNull() {

        List<String> list = new ArrayList<>();
        list.add("aba");
        list.add(null);
        list.add("cla");

        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertEquals(Indexer.search(listIndexer, null),-1);
    }

}