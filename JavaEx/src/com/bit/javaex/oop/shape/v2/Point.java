package com.bit.javaex.oop.shape.v2;

public class Point implements Drawable {
	// 필드(protected
	protected int x;
	protected int y;
	//생성자
//	public Point() {
//		//기본 생성자
//	}
	
	public Point(int x, int y) {
		//super()가 생략
		this.x=x;
		this.y=y;
	}

	//
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.printf("점 [%d, %d]" + "을 그렸습니다.", x, y);
		System.out.println();
	}
	
	//메소드 오버로딩(다형성 중)
	//같은 리턴타입,같은 이름의 메서드를 중복해서 선언하는 것
	//메서드 인자 값에 따라 ㅈㄱ금삭 다른 기능을 수행하도록 만들 수 있다
	public void draw(boolean show) {
		//boolean show가 true면 그렇습니다 false면 지워습니다
		String message=String.format("점[%d, %d]을", x, y);
		if (show) {
			message += "그렸습니다";
			
		}else{
			message += "지웠습니다";
		
			
		}
		System.out.println(message);
	
	}
	

}
