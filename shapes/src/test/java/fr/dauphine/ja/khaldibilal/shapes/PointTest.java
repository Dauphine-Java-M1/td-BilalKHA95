package fr.dauphine.ja.khaldibilal.shapes;

import java.util.ArrayList;

public class PointTest {
	
	public static void main(String args[]) {
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

		
		
		
		
		
	}
	

}