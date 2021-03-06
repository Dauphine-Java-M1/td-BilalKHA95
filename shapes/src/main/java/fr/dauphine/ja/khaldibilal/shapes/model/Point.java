package fr.dauphine.ja.khaldibilal.shapes.model;

public class Point extends Shape{
	private int x ; 
	private int y ; 
	private static int compteur = 0 ; 
	
	public Point(int px , int py) {
		this.x = px ; 
		this.y = py ; 
		Point.compteur++ ; 
		
	}
	
	public Point(Point unPoint) {
		this.x = unPoint.getX() ; 
		this.y = unPoint.getY() ; 
		}
	
	public int getX() {
		return this.x ; 
	}
	public int getY() {
		return this.y ; 
	}
	public static int getNombrePoint() {
		return Point.compteur ; 
	}
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")" ; 
	}
	
	public boolean isSameAs(Point p) {
		if(this.x == p.getX() && this.y == p.getY())return true;
		else return false ; 
		
		
	}
	
	@Override
	public boolean equals(Object o ) {
		if(o instanceof Point) {
			Point p = ((Point)o);
			return this.isSameAs(p) ;
			}else {
			return false ; 
			
			
		}
		
		
	}
	
	public void translate(int dx , int dy) {
		this.x+=dx ; 
		this.y+=dy ; 
	}

	@Override
	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return this.isSameAs(p) ; 
	}


}
