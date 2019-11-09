package fr.dauphine.ja.khaldibilal.shapes;

public class LigneBrisee {
	private Point m_suitePoint[];
	
	public LigneBrisee(int nombrePoint) {
		this.m_suitePoint = new Point[nombrePoint] ;
	}
	
	public void add(Point p) {
		for(int i=0 ; i < this.m_suitePoint.length ; i++) {
			if(this.m_suitePoint[i] == null) {
				this.m_suitePoint[i] = p ;
				i = this.m_suitePoint.length;
			}
			
		}
		
	}
	
			

}
