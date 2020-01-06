package fr.dauphine.ja.khaldibilal.shapes.view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import fr.dauphine.ja.khaldibilal.shapes.model.LigneBrisee;

public class LigneDrawer implements ShapeDrawable {
	private LigneBrisee m_ligne;

	public void draw(Graphics2D g) {
		for (int i = 0; i < this.m_ligne.nbPoint() - 1; i++) {
			g.drawLine(m_ligne.getLigne().get(i).getX(), m_ligne.getLigne().get(i).getY(),
					m_ligne.getLigne().get(i + 1).getX(), m_ligne.getLigne().get(i + 1).getY());
		}
	}
}
