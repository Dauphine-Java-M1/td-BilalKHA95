package fr.dauphine.ja.khaldibilal.shapes.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.util.Observable;

import fr.dauphine.ja.khaldibilal.shapes.model.Circle;

public class CircleDrawer implements ShapeDrawable {
	private Circle m_myCircle;
	
	public CircleDrawer(Circle myC) {
		this.m_myCircle = myC ; 
	}

	public void draw(Graphics2D g) {
		Shape circle = new Ellipse2D.Double(m_myCircle.getCenter().getX() - m_myCircle.getRayon(),
				m_myCircle.getCenter().getY() - m_myCircle.getRayon(), 2 * m_myCircle.getRayon(),
				2 * m_myCircle.getRayon());
		g.draw(circle);
	}
}
