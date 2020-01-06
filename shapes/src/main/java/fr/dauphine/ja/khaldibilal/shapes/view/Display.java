package fr.dauphine.ja.khaldibilal.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.khaldibilal.shapes.model.Circle;
import fr.dauphine.ja.khaldibilal.shapes.model.Point;
import fr.dauphine.ja.khaldibilal.shapes.model.Shape;
import fr.dauphine.ja.khaldibilal.shapes.model.World;

public class Display extends JPanel implements Observer {
	private World m_world;

	public Display(World world) {
		super();
		this.m_world = world;
	}

	@Override
	public void paintComponent(Graphics g) {
		for (Shape s : this.m_world.getShapes()) {
			s.getDraw().draw((Graphics2D) g);
		}
	}

	public static void main(String[] args) {
		World w = new World(200, 200);
		Circle a = new Circle(new Point(50, 50), 20);
		a.setShapeDrawable(new CircleDrawer(a));
		w.ajouterForme(a);
		JFrame frame = new JFrame("Java");
		frame.setSize(new Dimension(w.getLargeur(), w.getHauteur()));
		Display d = new Display(w);
		frame.add(d);
		frame.setVisible(true);
		Circle b = new Circle(new Point(70, 70), 20);
		b.setShapeDrawable(new CircleDrawer(b));
		w.ajouterForme(b);
		
		
	}

	public void update(Observable o, Object arg) {
		this.repaint();
	}
}
