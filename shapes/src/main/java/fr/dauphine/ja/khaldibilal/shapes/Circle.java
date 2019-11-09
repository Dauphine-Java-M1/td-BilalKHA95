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
	
	

}
