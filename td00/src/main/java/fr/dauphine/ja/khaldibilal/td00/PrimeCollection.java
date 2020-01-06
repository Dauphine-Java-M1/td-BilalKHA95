package fr.dauphine.ja.khaldibilal.td00;

import java.io.ObjectInputStream.GetField;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Random ;
/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers ; 
	 
	
	public static void main(String args[]) {
		PrimeCollection test = new PrimeCollection() ; 
		test.initRandom(100, 1999);
		test.printPrimes();
		
		
		
		
		String a ; 
	}
	
	public PrimeCollection() {
		this.numbers = new ArrayList<Integer>() ; 
		
	}
	
	public void initRandom(int n , int m ) {
		for(int i =0 ; i <n ; i++) {
			Random monAlea = new Random() ; 
			this.numbers.add(monAlea.nextInt(m+1));
			
		}
	}
	public boolean isPrime(int p ) {
		int max = (int)Math.sqrt(p) ; 
		
		for (int i= 2 ; i <= max ; i++) {
			if( (p % i) == 0 ) {
				return false;
				}
			}
		return true ; 
	}
	
	public void printPrimes() {
		
		for (Integer i : this.numbers) {
			if(this.isPrime(i)) {
				System.out.println(i) ; 
				}
			}
	}
	
    
}
