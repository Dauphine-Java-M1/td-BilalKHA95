package fr.dauphine.ja.khaldibilal.threads;

public class ScalarThread extends Thread {
	private MySafeList<Double> v1;
	private MySafeList<Double> v2;
	private int begin;
	private int end;
	private double result;

	public ScalarThread(MySafeList<Double> s1, MySafeList<Double> s2, int bg, int ed) {
		this.v1 = s1;
		this.v2 = s2;
		this.begin = bg;
		this.end = ed;
	}

	@Override
	public void run() {
		this.result = MySafeList.scalar(begin, end, v1, v2);
	}

	public double getResult() {
		return this.result;
	}
}
