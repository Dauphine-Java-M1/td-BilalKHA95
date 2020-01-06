package fr.dauphine.ja.khaldibilal.shapes.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.MouseController;
import fr.dauphine.ja.khaldibilal.shapes.model.Circle;
import fr.dauphine.ja.khaldibilal.shapes.model.Point;
import fr.dauphine.ja.khaldibilal.shapes.model.Ring;
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
		World w = new World(800, 800);
		
		Circle a = new Circle(new Point(50, 50), 20);
		a.setShapeDrawable(new CircleDrawer(a));
		w.ajouterForme(a);
		JFrame frame = new JFrame("Java");
		frame.setSize(new Dimension(w.getLargeur(), w.getHauteur()));
		Display d = new Display(w);
		w.addObserver(d);
		frame.add(d);
		frame.setVisible(true);
		
		MouseController test = new MouseController(w) ; 
		d.addMouseMotionListener(test);
		d.addMouseListener(test);
		
		
	}

	public void update(Observable o, Object arg) {
	
	

		this.revalidate();
		this.repaint();
	}
}
