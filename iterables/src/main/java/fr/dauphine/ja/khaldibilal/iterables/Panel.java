package fr.dauphine.ja.khaldibilal.iterables;

import java.util.AbstractList;
import java.util.Iterator;

public class Panel {
	public static Iterator<Integer> panel1(final int borneinf, final int bornesup) {
		return new Iterator<Integer>() {
			private int i = borneinf;

			public boolean hasNext() {
				return (i <= bornesup);
			}

			public Integer next() {
				i++;
				return new Integer(i - 1);
			}
		};
	}

	public static Iterable<Integer> panel2(final int borneinf, final int bornesup) {
		return new Iterable<Integer>() {
			public Iterator<Integer> iterator() {
				return panel1(borneinf, bornesup);
			}
		};
	}

	public static AbstractList<Integer> panel(final int borneinf, final int bornesup) {
		if(borneinf > bornesup) throw new IllegalArgumentException() ; 
		
		return new AbstractList<Integer>() {
			@Override
			public Integer get(int index) {
				if (borneinf + index <= bornesup) {
					return borneinf + index;
				} else {
					throw new IndexOutOfBoundsException();
				}
			}

			@Override
			public int size() {
				return bornesup - borneinf +1;
			}
		};
	}

	public static void main(String[] args) {
		AbstractList<Integer> it = panel(3, 6);
		for (Integer itt : it) {
			System.out.println(itt);
		}
	}
}
