package fr.dauphine.ja.khaldibilal.iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mult {
	public static List<Integer> mult(int scalaire, List<Integer> valeur) {
		ArrayList<Integer> maListe = new ArrayList<Integer>();
		for (int v : valeur) {
			maListe.add(v * scalaire);
		}
		return maListe;
	}

	public static AbstractList<Integer> multNew(final int scalaire, final List<Integer> valeur) {
		return new AbstractList<Integer>() {
			@Override
			public int size() {
				return valeur.size();
			}

			@Override
			public Integer get(int index) {
				return valeur.get(index) * scalaire;
			}
		};
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 1000000; i++) {
		al.add(i);
		}
		long t0 = System.nanoTime();
		List<Integer> ret = Mult.multNew(2, al);
		long sum=0;
		for(int val : ret) {
		sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i = 0; i < 1000000; i++) {
		ll.add(i);
		}
		t0 = System.nanoTime();
		sum=0;
		ret = Mult.mult(2, ll);
		for(int val : ret) {
		sum+=val/2;
		}
		System.out.println((System.nanoTime() - t0));

	}
}
