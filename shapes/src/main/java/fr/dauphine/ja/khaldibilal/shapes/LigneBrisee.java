package fr.dauphine.ja.khaldibilal.shapes;

import java.util.LinkedList;
import java.util.Objects;

public class LigneBrisee {
	private LinkedList m_suitePoint ; 
	
	
	public LigneBrisee(int nombrePoint) {
		this.m_suitePoint = new LinkedList() ;
	}
	
	public void add(Point p) {
		Objects.requireNonNull(p) ; 
		this.m_suitePoint.add(p) ; 
		
		
	}
	

	
	public int nbPoint() {
		return this.m_suitePoint.size() ;
		}
	
	public boolean contains(Point p) {
		return this.m_suitePoint.contains(p);
		}
}
