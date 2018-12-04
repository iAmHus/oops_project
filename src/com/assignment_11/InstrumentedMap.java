package com.assignment_11;
import java.util.*;

/* InstrumentedMap class extending ForwardingMap class which implements the Map interface
*   - Murtuza Hussain Shareef(G01024452)
*/

public class InstrumentedMap<K,V> extends ForwardingMap<K,V> {
	public InstrumentedMap(HashMap<K,V> s)
	{
		super(s);
	}
	private int addCount = 0;
	public int getAddCount() {return addCount;}
}
