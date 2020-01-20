package fr.dauphine.ja.khaldibilal.genereics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Utils {
	public static <T extends Comparable<T>> T myMax(T first, T... tab) {
		T max = first;
		for (int i = 0; i < tab.length; i++) {
			if (max.compareTo(tab[i]) == -1) {
				max = tab[i];
			}
		}
		return max;
	}

	private static void print(List<?> list) {
		for (Object o : list)
			System.out.println(o);
	}

	private static void printLongueur(List<? extends CharSequence> list) {
		for (CharSequence a : list) {
			System.out.println(a.length());
		}
	}

	private static <T extends CharSequence> ArrayList<Integer> listLength(List<T> list) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (T elem : list) {
			ret.add(elem.length());
		}
		return ret;
	}

	private static ArrayList<Integer> listLengthh(List<? extends CharSequence> list) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (CharSequence elem : list) {
			ret.add(elem.length());
		}
		return ret;
	}

	private static <T> ArrayList<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		Iterator<? extends T> t1 = l1.iterator();
		Iterator<? extends T> t2 = l2.iterator();
		ArrayList<T> fusion = new ArrayList<T>();
		while (t1.hasNext()) {
			fusion.add(t1.next());
			fusion.add(t2.next());
		}
		return fusion ; 
	}

	public static void main(String[] args) {
		
		
		
	}
}
