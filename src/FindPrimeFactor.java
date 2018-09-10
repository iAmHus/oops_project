import java.util.Arrays;
import java.util.List;

public class FindPrimeFactor {


    //TODO: Do we need to throw the exceptions - that were given as comments in Assignment 1
    //TODO: Do we need to create a html file for Javadoc.


    //Sample code to test it out !
    public static void main(String[] args) {

        List<Integer> a = null;
        List<Integer> b = null;
//        System.out.println("Index of the prime factor is " + findPrimeFactor(a, b));

        a = Arrays.asList(12, 4, 9);
        b = Arrays.asList(1, -2, 3);
//        System.out.println("Index of the prime factor is " + findPrimeFactor(a, b));

        a = Arrays.asList(12, 4, 9);
        b = Arrays.asList(1, 0, 3);
//        System.out.println("Index of the prime factor is " + findPrimeFactor(a, b));

        a = Arrays.asList(12, 4, 8);
        b = Arrays.asList(1, 3, 3);
//        System.out.println("Index of the prime factor is " + findPrimeFactor(a, b));
    }


    // Requires: a not null; b not null;
    //           there is some index i where b[i] is
    //           both prime and a factor of a[i]


    //          NPE - handle case when individual elements are null
    //          Arithmetic exception -  divide by 0 ; negative numbers ;


    // Effects: return the least index
    //          at which b[i] is a prime factor of a[i]
    // E.g. findPrimeFactor ([12, 25, 18, 8], [6, 2, 3, 2]) = 2
    // (Note: 6 is a factor of 12, but is not prime,
    //  and 2 is prime, but is not a factor of 25.  However,
    //  3 is a prime factor of 18. Hence, index "2" is the correct
    //  answer.  index "3" is not a possible answer, because the
    //  third index is not the least index with the desired property.)

    // Also note that a[] and b[] need not be of the same length.

    /**
     * Find prime factor int.
     *
     * @param a the input list 'a'
     * @param b the input list 'b'
     * @return the index at which b[i] is a prime-factor of a[i]
     * @throws NullPointerException     when either one of the inputs passed is a null list (NOT a list containing nulls)
     * @throws IllegalArgumentException  when there is no element in 'b' which is a prime factor of the corresponding element in 'a'
     */
    public static int findPrimeFactor(List<Integer> a, List<Integer> b) throws NullPointerException, IllegalArgumentException {

//        Precondition for a is not null and b is not null
        if (a == null || b == null) {
            throw new NullPointerException("The inputs passed to the method are null");
        }

        //Find the smaller of the two lists and iterate over it - so as to minimize the num of iterations !
        List<Integer> smallerList = a.size() < b.size() ? a : b;

        //Pre-condition dictates that there will be a prime-factor present - so even in the worst case,
        // the prime factor will be located at the last index of the smaller list. (This is being set as a default value)
        int indexOfPrimeFactor = -1;

        // Pick the index at which 'b' has a prime and 'b' is a factor of 'a'
        for (int index = 0; index < smallerList.size(); index++) {

            // If current element of either 'a' or 'b' is null - skip to the next element
            if (a.get(index) == null || b.get(index) == null) {
                continue;
            }

            // If current element in 'b' is 0, skip to the next element
            if (b.get(index) == 0) {
                continue;
            }

            // If current element of either a or b is negative - skip to the next element
            if (a.get(index) < 0 || b.get(index) < 0) {
                continue;
            }

            if (isPrime(b.get(index)) && isFactorOf(b.get(index), a.get(index))) {
                indexOfPrimeFactor = index;
                return indexOfPrimeFactor;
            }
        }

        // Pre-condition when there is no prime factor found !
        if (indexOfPrimeFactor == -1) {
            throw new IllegalArgumentException("No prime-factor found in the given inputs");
        }

        return indexOfPrimeFactor;
    }

    private static boolean isFactorOf(int elementInB, int elementInA) {
        return elementInA % elementInB == 0;
    }


    public static boolean isPrime(int a) {

        if (a == 1) {
            return false;
        }

        for (int i = 2; i <= a / 2; i++) {
            if (isFactorOf(i, a)) {
                return false;
            }
        }
        return true;
    }
}
