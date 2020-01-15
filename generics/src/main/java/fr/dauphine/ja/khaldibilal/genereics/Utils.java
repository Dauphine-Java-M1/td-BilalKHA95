package fr.dauphine.ja.khaldibilal.genereics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	private static ArrayList<Integer> listLengthh(List<? extends CharSequence> list){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (CharSequence elem : list) {
			ret.add(elem.length());
		}
		return ret;
		
	}
	

	public static void main(String[] args) {
		System.out.println(myMax(8.6, 16.64));
		List<String> list = Arrays.asList("foo", "toto");
		print(list);
	}
}
