package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PositiveInteger positiveInteger = new PositiveInteger();
        int[] values = {1,5,7,4,1,2};
        System.out.println(positiveInteger.getResult(values));

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.getFibonacci(10);

        //ArrayMerge q = new ArrayMerge();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.result();
    }
}
