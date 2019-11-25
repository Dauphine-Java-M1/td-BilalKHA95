package fr.dauphine.ja.khaldibilal.iterables;

import java.util.AbstractList;
import java.util.Iterator;

public class Panel extends AbstractList {
	
	
	
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
			
		};
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}





}
