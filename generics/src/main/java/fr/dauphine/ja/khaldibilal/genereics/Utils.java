package fr.dauphine.ja.khaldibilal.genereics;

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

	public static void main(String[] args) {
		System.out.println(myMax(8.6,16.64));
	}
}
