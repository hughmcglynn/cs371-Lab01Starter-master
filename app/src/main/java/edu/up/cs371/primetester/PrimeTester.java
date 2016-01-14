package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0) {
            return true;
        }
        return false;
        // for now, return a random result
        //return Math.random() > 0.5;
    }
}
