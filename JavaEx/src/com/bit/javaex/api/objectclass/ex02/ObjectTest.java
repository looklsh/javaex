package com.bit.javaex.api.objectclass.ex02;

public class ObjectTest {

	public static void main(String[] args) {
		Point p= new Point(10,10);
		
		//자바의 최상위 클래스는 object 
		//기본적으로 모든 클래스는 object가 가진 모든 메서드를 사용할 ㅅ 있다.
		System.out.println(p.getClass().getName());
		System.out.println("Hashcode: " + p.hashCode());
		System.out.println("toString:" + p.toString());
		System.out.println("Point: " + p); //toString생략
		
		//== 은 객체의 동일성 비교: 같은 객체냐를 비교
		// .equals()은 객체의 값의 비교: 같은 은 값이냐 비교
		
		Point p2=new Point(10,10); // p와 x,y값에 같다
		System.out.println("p와 p2는 같은 객체인가?" + (p==p2));
		
		//Point p와 Point p2값을 비교
		System.out.println("p와 p2는 가은 값을 가지고 있는가?" + p.equals(p2));

	}

}
