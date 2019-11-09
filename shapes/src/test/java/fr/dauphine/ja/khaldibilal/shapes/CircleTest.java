package fr.dauphine.ja.khaldibilal.shapes;

import java.util.ArrayList;

public class CircleTest {
public static void main(String args[]) {
	Point p=new Point(1,2); 
	Circle c=new Circle(p,1);
	
	Circle c2=new Circle(p,2); c2.translate(1,1);
	
	System.out.println(c+" "+c2);
	System.out.println(c.contains(p.translate(100, 100))) ; 
		
	
	}
	

}
