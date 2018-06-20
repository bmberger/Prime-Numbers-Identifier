/**
 * Purpose: To implement/test PrimeNumber class. 
 * @author Briana Berger
 * @version 06/07/2018
 */

import java.util.Scanner; 
import java.util.ArrayList;
public class PrimeNumberTester
{
    /**
     * Constructor for objects of class PrimeNumberTester
     */
    public PrimeNumberTester()
    {
        // default constructor
    }
    
    public static void main(String[] args) 
    { 
        //declare and intialize scanner, array list, and count
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> allPrimes = new ArrayList<>();
        int count = 0;
        
        //User enters low and upper limits
        System.out.print("Enter your lower limit (integers only): ");
        final int lowerVal = reader.nextInt();
        
        System.out.print("Enter your upper limit (integers only): ");
        reader.nextLine();
        final int upperVal = reader.nextInt();
        
        //Creates primes object
        PrimeNumbers primes = new PrimeNumbers(lowerVal, upperVal);
        
        //Finds and assigns all the prime numbers in object to allPrimes
        allPrimes = primes.findPrimes(allPrimes);
        
        //Prints all of the prime numbers in range and counts how many prime numbers were found
        System.out.println("---------------------------------------------");
        System.out.println("All of the primes located between " + lowerVal + " and " + upperVal + ": ");
        System.out.print(" | ");
        for(Integer n : allPrimes)
        {
            System.out.print(n + " | ");
            count++;
        }
        System.out.println();
        System.out.println();
        System.out.println("The number of prime numbers found is " + count);
        System.out.println("---------------------------------------------");
    }
}