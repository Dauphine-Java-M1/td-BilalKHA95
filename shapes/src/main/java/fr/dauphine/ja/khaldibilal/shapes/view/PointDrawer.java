package fr.dauphine.ja.khaldibilal.shapes.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import fr.dauphine.ja.khaldibilal.shapes.model.Circle;
import fr.dauphine.ja.khaldibilal.shapes.model.Point;

public class PointDrawer implements ShapeDrawable {
	private Point m_point;
	private int m_radius ; 

	public PointDrawer(Point pts , int radius) {
		this.m_point = pts;
		this.m_radius = radius ; 
	}

	public void draw(Graphics2D g) {
		CircleDrawer deleg = new CircleDrawer(new Circle(this.m_point , this.m_radius)) ; 
		deleg.draw(g);
		
	}
}
