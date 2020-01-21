
import java.util.ArrayList;

public class Goldbach
{
    public static ArrayList<Integer> sieve (int n) {
        ArrayList<Integer> primesUnder = new ArrayList<Integer> ();
        ArrayList<Integer> error = new ArrayList<Integer> ();
        if (n <= 1) return error;
        for (int i = 2; i <= n; i ++) {
            primesUnder.add(i);
        }
        //System.out.println("Original array: " + primesUnder);
        int next = 0;
        int prime = primesUnder.get(next);
        int size = primesUnder.size();
        int indexOfPrime = 0;
        while (prime <= n) {
            indexOfPrime = primesUnder.indexOf(prime);
            if (indexOfPrime != -1 && indexOfPrime <= n - 1) {
                for (int i = indexOfPrime + 1; i < primesUnder.size(); i ++) {
                    if (primesUnder.get(i) % prime == 0) {
                        //System.out.println("Removed value: " + primesUnder.get(i));
                        primesUnder.remove(i);
                        //i --;
                    }
                }
            }
            size = primesUnder.size();
            if (next >= size - 1) return primesUnder;
            if(next < size - 1) {
                next ++;
                prime = primesUnder.get(next);
            }
            /*System.out.println("next: " + next);
            System.out.println("size: " + size);
            System.out.println("prime: " + prime);
             */
        }
        return primesUnder;
    }

    public static ArrayList <Integer> convert (int n) {
        ArrayList <Integer> conjecture = new ArrayList <Integer> ();
        ArrayList <Integer> primes = sieve(n);
        for (int i = 0; i <= primes.size(); i ++) {
            if (primes.contains(i) && primes.contains(n - i)) {
                conjecture.add(i);
                conjecture.add(n - i);
            }
        }
        return conjecture;
    }

    public static void main (String [] args) {
        System.out.println("4: " + convert(4));
        System.out.println("6: " + convert(6));
        System.out.println("10: " + convert(10));
        System.out.println("120: " + convert(120));
    }
}
