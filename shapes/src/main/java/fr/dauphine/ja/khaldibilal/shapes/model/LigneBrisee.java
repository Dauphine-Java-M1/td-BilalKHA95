package fr.dauphine.ja.khaldibilal.shapes.model;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee extends Shape {
	private LinkedList<Point> m_suitePoint;

	public LigneBrisee(int nombrePoint) {
		this.m_suitePoint = new LinkedList<Point>();
	}

	public void add(Point p) {
		Objects.requireNonNull(p);
		this.m_suitePoint.add(p);
	}

	public LinkedList<Point> getLigne() {
		return this.m_suitePoint;
	}

	public int nbPoint() {
		return this.m_suitePoint.size();
	}

	public boolean contains(Point p) {
		return this.m_suitePoint.contains(p);
	}

	@Override
	public void translate(int dx, int dy) {
		for (int i = 0; i < this.m_suitePoint.size(); i++) {
			this.m_suitePoint.get(i).translate(dx, dy);
		}
	}
}
