package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Amaka is a little girl who loves playing with array. In her 10th birthday, she got two arrays as presents. Let’s call them A and B. Both arrays have the same size n and contains integers between 0 to 30000.
Amaka’s hard-drive is almost full of presents and she barely has any space to keep the arrays. She discovered a brilliant function to merge the array into one:
int encodeInteger(int x, int n){
n = n<<(1<<(1<<(1<<1)));
x = x | n;
return x;
}
void encodeArray(int *A, int *B, int n){
for(int i=0;i<n;i++) {
A[i] = encodeInteger(A[i], B[i]);
}
}
Amaka passed A and B into the encodeArray function. After that she discarded array B and saved the modified version of array A in the hard-drive.
Now in her 15th birthday Amaka wants to play with those arrays again. She found the modified version of array A in the hard-drive but she forgot how to recover the original arrays from it.
 */

public class ArrayMerge {
    public void merge(){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int n = sc.nextInt();
            int[] modifiedA = new int[n];
            for (int i = 0; i < modifiedA.length; i++) {
                modifiedA[i] = sc.nextInt();
            }

            System.out.printf("Case %d:%n", tc + 1);
            System.out.println(solve(modifiedA));
        }

        sc.close();
    }

    static String solve(int[] modifiedA) {
        int n = modifiedA.length;

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = modifiedA[i] % (1 << 16);
            B[i] = modifiedA[i] / (1 << 16);
        }

        return String.format("%s\n%s", formatArray(A), formatArray(B));
    }

    static String formatArray(int[] a) {
        return Arrays.stream(a)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}