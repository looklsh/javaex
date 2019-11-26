package com.bit.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s=new shape(); // 안됨 추상클래스라서
		Drawable r=new Rectangle(10,10,100,50);
		r.draw();
		
		
		Drawable c=new Circle(20,20,10);
		c.draw();
		
		//rectangle, circle은 shape를 상속받은 개개체
		//point는 직접 상속관계에 포힘되지 않은 별개의 객체
		//인터페이스 Drawable타입으로 참조할수 이싸
		
		c= new Point(10,10);
		
		if (c instanceof Drawable) {
			c.draw();
		}
		
		Drawable[] objs = new Drawable[3];
		objs[0]= new Rectangle (10,10,100,50);
		objs[2]=new Circle(20,20,50);
		objs[2]=new Point(30,30);
		
		for (Drawable obj:objs) {
			obj.draw();
		}
		

	}

}
