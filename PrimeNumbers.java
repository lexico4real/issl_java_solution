package com.company;

public class PrimeNumbers {
    /*
    Write a Java program to print prime numbers between 1 and 100 backwards
     */
    public void result(){
        int start = 1, end = 100;
        System.out.println("\nPrime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
