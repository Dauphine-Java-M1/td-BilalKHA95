package fr.dauphine.ja.khaldibilal.shapes.model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class World extends Observable {
	private ArrayList<Shape> m_mesFormes;
	private int m_largeur ; 
	private int m_hauteur ; 

	public World(int sizeX , int sizeY) {
		this.m_mesFormes = new ArrayList<Shape>();
		this.m_hauteur = sizeY ; 
		this.m_largeur = sizeX ; 
	}

	public void ajouterForme(Shape uneForme) {
		this.m_mesFormes.add(uneForme);
		this.setChanged();
		this.notifyObservers();
	}

	public ArrayList<Shape> getShapes() {
		return this.m_mesFormes;
	}
	public int getLargeur() {
		return this.m_largeur ;
	}
	public int getHauteur() {
		return this.m_hauteur ; 
	}
	
	public void worldChanged() {
		this.setChanged();
		this.notifyObservers();
	}
}
