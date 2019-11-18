package fr.dauphine.ja.khaldibilal.iterables;

import java.util.Iterator;

public class Panel {
	
	
	
	public static Iterator<Integer> panel1( final int borneinf , final int bornesup){
		return new Iterator<Integer>() {
			private int i = borneinf ; 

			public boolean hasNext() {
				if(i<= bornesup) {
					return true ; 
				}
			
				return false;
			}

			public Integer next() {
				if(hasNext()) {i++;return new Integer(i);}
				else return null ;
				
			}
			
		};
		
		
	}
	
	public static Iterable<Integer>panel2(final int borneinf , final int bornesup){
		return new Iterable<Integer>() {

			public Iterator<Integer> iterator() {
				return panel1(borneinf,bornesup) ; 
			}
			
		}
		
	}





}
