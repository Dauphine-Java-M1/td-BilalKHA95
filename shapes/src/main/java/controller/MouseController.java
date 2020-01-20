package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import fr.dauphine.ja.khaldibilal.shapes.model.Point;
import fr.dauphine.ja.khaldibilal.shapes.model.Shape;
import fr.dauphine.ja.khaldibilal.shapes.model.World;

public class MouseController implements MouseMotionListener, MouseListener {
	private World m_world;
	private Shape m_selectedShape;
	private Point m_pred ; 
	private Point m_now ;
	
	public MouseController(World wr) {
		this.m_world = wr ; 
	}

	public void mouseDragged(MouseEvent e) {
		if(this.m_selectedShape != null) {
			this.m_selectedShape.translate(this.m_now.getX() - this.m_pred.getX(), this.m_now.getY() - this.m_pred.getY());
			System.out.println(this.m_selectedShape);
			this.m_world.worldChanged();
			
		}else {
			System.out.println("Cliquer sur une forme pour la déplacer");
		}

		
		this.m_pred = this.m_now ; 
		this.m_now = new Point(e.getX() , e.getY()) ; 
	}

	public void mouseMoved(MouseEvent e) {
		this.m_pred = this.m_now ; 
		this.m_now = new Point(e.getX() , e.getY()) ; 
		this.m_selectedShape=null ; 
	}

	public void mouseClicked(MouseEvent e) {
		
		this.m_now = new Point(e.getX() , e.getY()) ; 
		boolean found = false ; 
		for (Shape s : this.m_world.getShapes()) {
			if (s.contains(m_now)) {
				this.m_selectedShape = s;
			found = true ;
			break;}
		}
		if(!found)this.m_selectedShape=null ; 
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}
