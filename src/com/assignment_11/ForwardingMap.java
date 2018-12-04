package com.assignment_11;
import java.util.*;
public class ForwardingMap<K,V> implements Map<K,V>{

	private HashMap<K,V> s = new HashMap<>();
	public ForwardingMap(HashMap<K,V>s)
	{
		this.s = s;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	public Map<K,V> getMap() {
		return s;
	}
    @Override
    public boolean equals(Object o)
    {
    	ForwardingMap mp = (ForwardingMap) o;
    	return s.equals(mp.getMap()); 
    }
	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public V put(K arg0, V arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void putAll(Map<? extends K, ? extends V> arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public V remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
