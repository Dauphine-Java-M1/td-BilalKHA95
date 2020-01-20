package fr.dauphine.ja.khaldibilal.threads;

import java.util.ArrayList;

public class MySafeList<E> {
	private ArrayList<E> m_tab = new ArrayList<E>();
	private final Object m_monitorEdit = new Object();

	public void add(E element) {
		synchronized (m_monitorEdit) {
			this.m_tab.add(element);
		}
	}

	public E get(int index) {
		return this.m_tab.get(index);
	}

	public int size() {
		return this.m_tab.size();
	}

	public static boolean stressTest(int n, final int m) {
		final MySafeList<Double> maListe = new MySafeList<Double>();
		Thread[] mesThread = new Thread[n];
		for (int i = 0; i < n; i++) {
			mesThread[i] = new Thread(new Runnable() {
				public void run() {
					for (int j = 0; j < m; j++) {
						maListe.add(0.0);
					}
				}
			});
			mesThread[i].start();
		}
		for (int i = 0; i < n; i++) {
			try {
				mesThread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return !(maListe.size() != n * m);
	}

	public static double scalar(int begin, int end, MySafeList<Double> firstVect, MySafeList<Double> secondVect) {
		if (firstVect.size() != secondVect.size() || (end < begin) || (end > firstVect.size()))
			throw new IllegalArgumentException();
		double product = 0.00;
		for (int i = begin; i < end; i++) {
			product += firstVect.get(i) * secondVect.get(i);
		}
		return product;
	}

	public static double parallelScalar(MySafeList<Double> v1, MySafeList<Double> v2, int n) {
		ScalarThread[] mesThread = new ScalarThread[n];
		int saut = v1.size() / n;
		int step = 0;
		for (int i = 0; i < n; i++) {
			mesThread[i] = new ScalarThread(v1, v2, step, step + saut);
			mesThread[i].start();
			step += saut;
		}
		double result = 0;
		for (int i = 0; i < n; i++) {
			try {
				mesThread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result += mesThread[i].getResult();
		}
		return result;
	}
}
