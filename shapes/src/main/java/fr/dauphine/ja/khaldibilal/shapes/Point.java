package fr.dauphine.ja.khaldibilal.shapes;

public class Point {
	private int x ; 
	private int y ; 
	private static int compteur = 0 ; 
	
	public Point(int px , int py) {
		this.x = px ; 
		this.y = py ; 
		Point.compteur++ ; 
		
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


}
