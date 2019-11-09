package fr.dauphine.ja.khaldibilal.shapes;

import java.util.Objects;

public class LigneBrisee {
	private Point m_suitePoint[];
	private int m_indexLastElement ; 
	
	public LigneBrisee(int nombrePoint) {
		this.m_suitePoint = new Point[nombrePoint] ;
		this.m_indexLastElement = 0 ; 
	}
	
	public void add(Point p) {
		Objects.requireNonNull(p) ; 
		if(!(this.m_suitePoint.length == this.m_indexLastElement)) {
			this.m_suitePoint[this.m_indexLastElement] = p;
			this.m_indexLastElement++ ;
			}
		
	}
	
	public int pointCapacity() {
		return this.m_suitePoint.length ;
		}
	
	public int nbPoint() {
		return this.m_indexLastElement ;
		}
	
	public boolean contains(Point p) {
		for(Point a : this.m_suitePoint) {
			if(a.equals(p))return true;
			}
		return false ; 
	}
	
			

}
