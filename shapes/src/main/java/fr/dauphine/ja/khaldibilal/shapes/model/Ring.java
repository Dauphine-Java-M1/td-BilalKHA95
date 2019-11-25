package fr.dauphine.ja.khaldibilal.shapes.model;

public class Ring extends Circle {
	private int m_rayonInterne ; 
	
	public Ring(Point centre,int rayonInterne , int rayonExterne) {
		super(centre,rayonExterne) ; 
		if(rayonInterne>=rayonExterne ) {
			throw new IllegalArgumentException("rayon interne must be < rayonExterne");
			}else {
			this.m_rayonInterne = rayonInterne ;
		}
		
	}
	
	@Override
	public boolean equals(Object o ) {
		if(o instanceof Ring) {
			Ring a = (Ring)o ; 
			if(a.getCenter().equals(this.getCenter()) && this.m_rayonInterne == a.m_rayonInterne && this.getRayon() == a.getRayon())return true ;
			else return false ; 
		
		
		}
		return false ; 
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " Rayon interne :" + this.m_rayonInterne ; 
	}
	@Override
	public boolean contains(Point p ) {
		Circle cercleInterne = new Circle(this.getCenter(),this.m_rayonInterne) ; 
		if(cercleInterne.contains(p))return true;
		else return false ; 
		
	}
	
	public boolean contains(Point p , Ring... anneaux) {
		for(int i=0;i<anneaux.length;i++) {
			if(anneaux[i].contains(p))return true ;
		}
		return false ; 
		
		
	}
		
		
	
	
		
		
	}


