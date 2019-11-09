package fr.dauphine.ja.khaldibilal.shapes;

public class Circle {
	private Point m_monCentre ; 
	private int m_rayon ; 
	
	public Circle(Point centre , int rayon) {
		this.m_monCentre = centre ; 
		this.m_rayon = rayon ; 
		}
	@Override
	public String toString() {
		
		return "Centre : " +this.m_monCentre.toString() + " Rayon :" + this.m_rayon + " Surface : " + this.surface() ; 
	}
	
	public void translate(int dx , int dy) {
		this.m_monCentre = m_monCentre.translate(dx, dy) ; 
		
		
	}
	
	public double surface() {
		return Math.PI*this.m_rayon*this.m_rayon;
		}
	
	public Point getCenter() {
		return new Point(this.m_monCentre.getX() , this.m_monCentre.getY()) ; 
		
	}
	
	public boolean contains(Point p ) {
		int distance = (int) Math.sqrt(Math.pow(this.m_monCentre.getX() - p.getX(), 2) + Math.pow(this.m_monCentre.getY()- p.getY(), 2)) ;
		if(distance > this.m_rayon)return false;
		else return true ;
		
	}
	
	public boolean contains(Point p , Circle... cercle) {
		for(int i=0;i<cercle.length;i++) {
			int distance = (int) Math.sqrt(Math.pow(cercle[i].m_monCentre.getX() - p.getX(), 2) + Math.pow(cercle[i].m_monCentre.getY()- p.getY(), 2)) ;
			if(distance <= this.m_rayon)return true ;
			}
		return false ; 
		
		
	}
	
	

}
