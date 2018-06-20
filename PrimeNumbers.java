
/**
 * Purpose: To to calculate and count the quantity of prime numbers between a given range.
 *
 * @author Briana Berger
 * @version 06/08/2018
 */

import java.util.Scanner; 
import java.util.ArrayList;
public class PrimeNumbers extends PrimeNumberTester
{
    private int low, high;
    
    /**
     * Constructor for objects of class PrimeNumber
     */
    public PrimeNumbers(int l, int h)
    {
        this.low = l;
        this.high = h;
    }
    
    /**
     *  To frind all the primes between this.low and this.high and return the array list filled with the primes.
     */
    public ArrayList findPrimes(ArrayList p)
    {
        int val = this.low;
        
        //Starts it off on a prime number to ensure accuracy
        if(this.low == 0 || this.low == 1)
            val = 2;
        
        //Outer loop loops through all the values between low and high
        for(int i = val; i <= this.high; i++)
        {
            int count = 0;
            
            //inner loop goes through to see if each value is not prime. If it is prime, count will be 0 and exit to if (& then added to primes list).
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                p.add(i);
            }
        }
        return p;
    }
}
