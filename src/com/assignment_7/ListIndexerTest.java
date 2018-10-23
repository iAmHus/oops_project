package com.assignment_7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListIndexerTest {

    @Test
    public void testPositiveCase() {

        List<String> list = new ArrayList<>();
        list.add("aba");
        list.add("bla");
        list.add("cla");

        Indexer<String> listIndexer = new ListIndexer<>(list);
        assertEquals(Indexer.search(listIndexer, "aba"),0);
    }

}