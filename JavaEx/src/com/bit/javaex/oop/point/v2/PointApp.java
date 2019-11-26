package com.bit.javaex.oop.point.v2;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1=new Point(10,10);
		
//		Point p1=new Point();
//		p1.setX(5);
//		p1.setY(10);
		p1.draw(true);
		p1.draw(false);
		
		Point p2=new Point(20,20);
		//아래 두 메서드는 오버로딩된 매서드들
		p2.draw(true);
		p2.draw(false);
		
		
	}
	
	

}
