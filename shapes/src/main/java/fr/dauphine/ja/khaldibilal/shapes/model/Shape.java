package fr.dauphine.ja.khaldibilal.shapes.model;

import java.util.Observable;

import fr.dauphine.ja.khaldibilal.shapes.view.ShapeDrawable;

public abstract class Shape extends Observable {
	private ShapeDrawable m_monDessin ; 
	
	public void setShapeDrawable(ShapeDrawable draw) {
		this.m_monDessin = draw ;
	}
	
	public ShapeDrawable getDraw() {
		return this.m_monDessin ; 
	}
	

	

}