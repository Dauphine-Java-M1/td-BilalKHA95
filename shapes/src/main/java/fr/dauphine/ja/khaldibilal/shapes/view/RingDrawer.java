package fr.dauphine.ja.khaldibilal.shapes.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import fr.dauphine.ja.khaldibilal.shapes.model.Circle;
import fr.dauphine.ja.khaldibilal.shapes.model.Ring;

public class RingDrawer implements ShapeDrawable {
	private Ring m_myRing;
	public RingDrawer(Ring mr) {
		this.m_myRing = mr ; 
	}

	public void draw(Graphics2D g) {
		CircleDrawer first = new CircleDrawer(new Circle(this.m_myRing.getCenter(), this.m_myRing.getRayon()));
		CircleDrawer second = new CircleDrawer(new Circle(this.m_myRing.getCenter(), this.m_myRing.getRayonInterne()));
		first.draw(g);
		second.draw(g);
	}
}
