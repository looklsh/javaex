package com.bit.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1=new Point(10,10);
		
//		Point p1=new Point();
//		p1.setX(5);
//		p1.setY(10);
		p1.draw();
		p1.draw(true);
		
		
		Point p2=new Point(20,20);
		//아래 두 메서드는 오버로딩된 매서드들
		
		p2.draw();
		p2.draw(false);
		
		
		Point p3= new ColorPoint(30,30,"RED");
		p3.draw();
		p3.draw(false);
	}
	
	

}
