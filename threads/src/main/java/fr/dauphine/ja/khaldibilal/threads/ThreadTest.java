package fr.dauphine.ja.khaldibilal.threads;

import java.util.Random;

public class ThreadTest {
	private static int nMax = 0;
	private final static Object monitor = new Object();

	public static Runnable testThread(final int id) {
		return new Runnable() {
			public void run() {
				synchronized (monitor) {
					for (; nMax < 10000; nMax++) {
						System.out.println("Je suis le thread: " + id + " Et j'effectue l'iteration:  " + nMax);
					}
				}
			}
		};
	}

	public static void main(String[] args) {
	//	new Thread(ThreadTest.testThread(1)).start();
		//new Thread(ThreadTest.testThread(2)).start();
		System.out.println(MySafeList.stressTest(10,10)) ; 
		int tailleVecteur = 100000 ; 
		MySafeList<Double>firstVect = new MySafeList() ; 
		MySafeList<Double>secondVect = new MySafeList() ; 
		for(int i=0 ; i<tailleVecteur ;i++) {
			firstVect.add(new Random().nextDouble());
			secondVect.add(new Random().nextDouble());
		}
		long start = System.nanoTime() ; 
		MySafeList.scalar(0,tailleVecteur,firstVect, secondVect);
		System.out.println("Time without thread : " + (System.nanoTime() - start)) ; 
		start = System.nanoTime() ;
		MySafeList.parallelScalar(firstVect, secondVect,2); 
		System.out.println("Time with thread : " + (System.nanoTime() - start)) ; 
		
		
	}
}
