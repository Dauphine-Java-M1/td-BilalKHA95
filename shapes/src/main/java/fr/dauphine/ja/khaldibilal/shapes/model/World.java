package fr.dauphine.ja.khaldibilal.shapes.model;

import java.util.ArrayList;

public class World {
	private ArrayList<Shape> m_mesFormes;
	
	public World() {
		this.m_mesFormes = new ArrayList<Shape>() ; 
	}
	
	public void ajouterForme(Shape uneForme) {
		this.m_mesFormes.add(uneForme) ; 

		
	}
	
	

}
