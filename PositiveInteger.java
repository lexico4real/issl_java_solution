package com.company;

import java.util.HashSet;
import java.util.Set;

/*
Write a simple Java function that given an array of N integers, return the smallest positive integer
(greater than 0) that does not occur in A. For example, given A= [1,5,7,4,1,2] the function should return 3.
- Given A = [1,2,3] the function should return 4
- Given A = [-1, -3] the function should return 1
i) Write an efficient algorithm for the following assumptions;
N is an integer within the range [1..100,000]
each element of array A is an integer within the range [-1,000,000..1,000,000]
 */

public class PositiveInteger {
    public int getResult(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return (N + 1);
    }
}
