package com.assignment_7;

import java.util.List;
import java.util.NoSuchElementException;

public class ListIndexer<E extends String> implements Indexer<E> {

    private List<E> listElem;

    public ListIndexer(List<E> listElem) {
        this.listElem = listElem;
    }

    public <E> int search(E x) {
        if (x == null) {
            return -1;
        } else {
            int searchIndex =  listElem.indexOf(x);
            if (searchIndex == -1) {
                throw new NoSuchElementException(x + "- value is not found in the class to be returned");
            } else {
                return searchIndex;
            }
        }
    }

    public int size() {
        return listElem.size();
    }

}
