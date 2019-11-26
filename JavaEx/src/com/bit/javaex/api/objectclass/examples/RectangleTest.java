package com.bit.javaex.api.objectclass.examples;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6,4); //24
		Rectangle b = new Rectangle(12,2); //24
		Rectangle c = new Rectangle(3,3); //9
		
		//a와b의 면적 비교(equals)
		System.out.println(a.equals(b)); //a b면적이 같은가
		System.out.println(b.equals(c)); //b c면적 비교

	}

}
