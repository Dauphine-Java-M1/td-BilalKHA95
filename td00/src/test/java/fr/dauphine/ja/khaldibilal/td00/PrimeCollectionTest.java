package fr.dauphine.ja.khaldibilal.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPrimeCollection()
    {
    	if(this.test0IsPrime(0)) {
    		assertTrue( true );
    	}else {assertTrue( false );}
    	
    	
    	if(this.testTwoIsPrime(2)) {
    		assertTrue( true );
    	}else {assertTrue(false);}
    	
    	if(!this.test9IsNotPrime(9)) {
    		assertTrue(true);
    	}else {assertTrue(false);}
        
    }
    
    public boolean test0IsPrime(int n) {
    	PrimeCollection test = new PrimeCollection() ; 
    	return test.isPrime(0) ;
    	}
    public boolean testTwoIsPrime(int n) {
    	PrimeCollection test = new PrimeCollection() ; 
    	return test.isPrime(2) ;
    	}
    public boolean test9IsNotPrime(int n) {
    	PrimeCollection test = new PrimeCollection() ; 
    	return test.isPrime(9) ;
    	}
}
