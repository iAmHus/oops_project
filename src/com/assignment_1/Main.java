package com.assignment_1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(12,24,8);
        List<Integer> b = Arrays.asList(1,2,3,7);
        System.out.println("Index of the prime factor is " + findPrimeFactor(a,b));
    }


    // Requires: a not null; b not null;
    //           there is some index i where b[i] is
    //           both prime and a factor of a[i]
    //
    // Effects: return the least index
    //          at which b[i] is a prime factor of a[i]
    // E.g. findPrimeFactor ([12, 25, 18, 8], [6, 2, 3, 2]) = 2
    // (Note: 6 is a factor of 12, but is not prime,
    //  and 2 is prime, but is not a factor of 25.  However,
    //  3 is a prime factor of 18. Hence, index "2" is the correct
    //  answer.  index "3" is not a possible answer, because the
    //  third index is not the least index with the desired property.)

    // Also note that a[] and b[] need not be of the same length.

    public static int findPrimeFactor(List<Integer> a, List<Integer> b) {

        //Find the smaller of the two lists and iterate over it - so as to minimize the num of iterations !
        List<Integer> smallerList = a.size() < b.size() ? a : b;

        //Pre-condition dictates that there will be a prime-factor present - so even in the worst case,
        // the prime factor will be located at the last index of the smaller list. (This is being set as a default value)
        int indexOfPrimeFactor = smallerList.size() - 1;

        // Pick the index at which 'b' has a prime and 'b' is a factor of 'a'
        for (int index = 0; index < smallerList.size(); index++) {
            if (isPrime(b.get(index)) && isFactorOf(b.get(index), a.get(index))) {
                indexOfPrimeFactor = index;
                return indexOfPrimeFactor;
            }
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
