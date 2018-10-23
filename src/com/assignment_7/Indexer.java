package com.assignment_7;

public interface Indexer<E> {

     public static <E> int search (Indexer<E> c, E x) {

        return c.search(x);
//        return new Searcher().search(c,x);
    }

     <E> int search(E x) ;

}
