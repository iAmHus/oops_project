package com.assignment_2;

import java.util.List;

/**
 * The class that has a static method 'findPrimeFactor' that finds the index of the prime-factor among the two lists.
 *
 * Contributions:
 *      - Murtuza Hussain Shareef(G01024452)
 *              - Implementation for the findPrimeFactor method
 *              - Top-level Javadoc and for all the utility methods involved
 *      - Harisha Rajam Swaminathan(G01085509)
 *              - Suggested more boundary scenarios that the code should cater to
 *              - JavaDoc for the findPrimeFactor method
 *      - Shubham Pudi (G01087664)
 *              Tested using Junit for different scenarios where
 *                  - positive flows were covered
 *                  - exceptions were thrown
 *
 *       In addition to this, every one contributed their ideas when collaborating and building the code together
 */


public class FindPrimeFactor {

    /**
     * Find prime factor int.
     *
     * @param a the input list 'a'
     * @param b the input list 'b'
     * @return the index 'i' at which b[i] is a prime-factor of a[i]
     * @throws NullPointerException     when either one of the inputs passed is a null list (NOT a list containing nulls)
     * @throws IllegalArgumentException when there is no element in 'b' which is a prime factor of the corresponding element in 'a'
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

    /**
     * Utility method that checks if element1 is a factor of element2.
     *
     * @param element2 the element2
     * @param element1 the element1
     *
     * @return the boolean value indicating if element2 is a factor of element1
     */
    private static boolean isFactorOf(int element2, int element1) {
        return element1 % element2 == 0;
    }


    /**
     * Utility method that checks if the element passed is a prime
     *
     * @param a the element to check
     * @return the boolean check indicating if the number passed is a prime or not
     */
    private static boolean isPrime(int a) {

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
