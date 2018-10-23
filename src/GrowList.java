import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


/**
 * The type Grow list - that is iterable !
 *
 * (i.e) It gives access to a method - that can act as an iterator
 *
 * Contributions:
 * *      - Shubham Pudi (G01087664)
 * *              - Implementation for the bag method
 * *              - Top-level Javadoc and for all the utility methods involved
 * *      - Harisha Rajam Swaminathan(G01085509)
 * *              - Suggested more boundary scenarios that the code should cater to
 * *              - JavaDoc for the repOk method
 *       - Murtuza Hussain Shareef(G01024452)
 *                  Tested using Junit for different scenarios where
 *  * *                  - positive flows were covered
 *  * *                  - exceptions were thrown
 * @param <E> the type parameter
 */
public class GrowList<E> implements Iterable<E>{

	  private Map<Integer,E> values;

	  public GrowList() { values = new HashMap<Integer,E>();}
	 
	  // add to the end of the list
	  public void add(E o) {
	     values.put(size(), o);
	  }

	  // number of values in list
	  public int size() { return values.size(); }

	  // get ith value in list
	  public E get(int i) { 
	     if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
	     return values.get(i);
	  }

	  // update ith value in list;  return previous value or null if none
	  public E set(int i, E o) {
	     if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
	     return values.put(i, o);
	  }
	  
	  // private helper method
	  private boolean inRange(int i) { return (i >= 0) && (i < size()); }

	  public String toString() {
	      if (size() == 0) return "[]";
	      String result = "[";
	      for (int i = 0; i < size()-1; i++) {
	          result += values.get(i) + ",";
	      }
	      return result + values.get(size() - 1) + "]";
	  }

	  private class Iterator implements java.util.Iterator<E> {
		  
		  int currentIdx ;

		  @Override
		  public boolean hasNext() {
			  return (currentIdx < values.size());
		  }

		  @Override
		  public E next() {
			  if(!hasNext()) {
				  throw new NoSuchElementException();
			  } else {
				 return values.get(currentIdx++);
			  }
		  }

		  @Override
		  public void remove() {
				throw new UnsupportedOperationException("Remove operation is not supported on GrowList !");
		  }
	  }

	@Override
	public java.util.Iterator<E> iterator() {
		return new Iterator();
	}

	public static void main(String[] args) {
	     GrowList<String> list = new GrowList();

	     System.out.println("list is:" + list);
	     list.add("cat");
	     System.out.println("list is:" + list);
	     list.add("dog");
	     System.out.println("list is:" + list);
	     list.set(1,"bat");
	     System.out.println("list is:" + list);

	     list.forEach(System.out::println);
	  }
	}