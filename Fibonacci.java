package com.company;

/*
Write a JAVA program to generate Fibonacci series
 */
public class Fibonacci {
    public void getFibonacci(int For){
        int start = 0 , n = 1, res , i;
        System.out.print(start+"\t"+n);

        for(i = 2; i < For; ++i){
            res = start + n;
            System.out.print("\t"+res);
            start = n;
            n = res;
        }
    }
}
