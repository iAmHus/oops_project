import java.util.HashMap;
import java.util.Map;

/**
 * The type Grow list.
 *
 * NOTE: We added separate methods (named accordingly)
 *      that would replicate the output of the SDL mutants - This helped us to run the test cases for all
 *      different scenarios in one-go
 *
 *      - Also, we added repOk() checks to the separate methods (described above) and the original mutators
 *      - This helped us test the positive test cases - i.e. if the function is running as it is supposed to !
 *
 * Contributions:
 * *      - Murtuza Hussain Shareef(G01024452)
 * *              - Implementation for the GrowList method
 * *              - Top-level Javadoc and for all the utility methods involved
 * *      - Harisha Rajam Swaminathan(G01085509)
 * *              - Suggested more boundary scenarios that the code should cater to
 * *              - JavaDoc for the findPrimeFactor method
 * *      - Shubham Pudi (G01087664)
 * *              Tested using Junit for different scenarios where
 * *                  - positive flows were covered
 * *                  - exceptions were thrown
 * *
 * *       In addition to this, every one contributed their ideas when collaborating and building the code together
 *
 * @param <E> the type parameter
 */
//  GrowList is a mutable list that only gets longer.
public class GrowList <E> {

    private Map<Integer,E> values;

    public GrowList() { values = new HashMap<Integer,E>();}

    // add to the end of the list
    public void add(E o) {
        values.put(size(), o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }
    }

    /**
     * Add with failing contract. - SDL mutant with one of the line removed - that causes the contract to fail
     *
     * @param o the o
     */
// add to the end of the list
    public void addWithFailingContract(E o) {
     // Mutation with the line below being removed
        //values.put(size(), o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }
    }

    /**
     * Add with failing rep ok. - SDL mutant with one of the line removed - that causes the RepOk to fail
     *
     * @param o the o
     */
// add to the end of the list
    public void addWithFailingRepOk(E o) {
        values.put(size(), o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }
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
        values.put(i, o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }

        return values.get(i);
    }

    /**
     * Sets with failing contract. - SDL mutant with one of the line removed - that causes the contract to fail
     *
     * @param i the
     * @param o the o
     * @return the with failing contract
     */
// update ith value in list;  return previous value or null if none
    public E setWithFailingContract(int i, E o) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");

        // This line has been removed - as a SDL mutant would have
        // Now, the value is not set at the specified index - BREAKING THE CONTRACT !!!
        //values.put(i, o);

        if (!repOk()) {
            throw new IllegalArgumentException("Bad argument passed ! Please check and resend");
        }

        return values.get(i);
    }

    /**
     * Sets with failing rep invariant.- SDL mutant with one of the line removed - that causes the repOk to fail
     *
     * @param i the
     * @param o the o
     * @return the with failing rep invariant
     */
// update ith value in list;  return previous value or null if none
    public E setWithFailingRepInvariant(int i, E o) {

        // This line has been removed - as a SDL mutant would have
        // Now, that the check for proper range of index has been removed,
        // it is possible to set a value at an invalid index (i.e) index that did not already exist OR a negative index etc.

        // This is VIOLATING THE REP-INVARIANT!!!

        //        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");

        values.put(i, o);

        if (!repOk()) {
            throw new IllegalArgumentException("RepOk failed - Bad argument passed ! Please check and resend");
        }
        return values.get(i);
    }


    /**
     *
     * RepOk - It has the following constraints -
     *              1. 0 <= index && i < size
     *              2. All the elements in the list are NON-NULL
     * @return - if the repOk check passed
     */
    private boolean repOk() {

        for (Map.Entry<Integer, E> entry : this.values.entrySet()) {

            Integer key = entry.getKey();
            E elem = entry.getValue();

            if (key == null || !inRange(key) || elem == null) {
                return false;
            }
        }
        return true;
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

    public static void main(String[] args) {
        GrowList<String> list = new GrowList<String>();

        System.out.println("list is:" + list);
        list.add("cat");
        System.out.println("list is:" + list);
        list.add("dog");
        System.out.println("list is:" + list);
        list.set(1,"bat");
        System.out.println("list is:" + list);
    }
}