package com.assignment_11;

import java.util.*;

public class ForwardingList<E> implements List<E> {
private List<E> s = new LinkedList<E>();
public ForwardingList(List<E>s)
{
	this.s = s;
}
public List<E> getList() {
	return s;
}
@Override
public boolean equals(Object o)
{
	ForwardingList lst = (ForwardingList) o;
	return s.equals(lst.getList());
}

@Override
public boolean add(E arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void add(int arg0, E arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public boolean addAll(Collection<? extends E> arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean addAll(int arg0, Collection<? extends E> arg1) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void clear() {
	// TODO Auto-generated method stub
	
}
@Override
public boolean contains(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean containsAll(Collection<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public E get(int arg0) {
	// TODO Auto-generated method stub
	return s.get(arg0);
}
@Override
public int indexOf(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Iterator iterator() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int lastIndexOf(Object arg0) {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public ListIterator<E> listIterator() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public ListIterator<E> listIterator(int arg0) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean remove(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public E remove(int arg0) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean removeAll(Collection<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean retainAll(Collection<?> arg0) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public E set(int arg0, E arg1) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public List<E> subList(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public <T> T[] toArray(T[] arg0) {
	// TODO Auto-generated method stub
	return null;
}
}