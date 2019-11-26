package com.bit.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s=new shape(); // 안됨 추상클래스라서
		Shape r=new Rectangle(10,10,100,50);
		r.draw();
		
		Shape c=new Circle(20,20,10);
		c.draw();

	}

}
