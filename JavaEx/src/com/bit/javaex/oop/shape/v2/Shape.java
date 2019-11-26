package com.bit.javaex.oop.shape.v2;

//도형을 작성하기 위한 부모 설계 클래스
//실체화해야 할 필요 없음 - >추상
public abstract class Shape {
	//필드
	protected int x;
	protected int y;
	
	//생성자
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//추상 메서드
	//      : 구현부는 없으며 싱속받은 자식 클래스에서 반드시 구현되어야 함
//	public abstract void draw();
	public abstract double area();
	//    IDrawable에 위임
	

}
