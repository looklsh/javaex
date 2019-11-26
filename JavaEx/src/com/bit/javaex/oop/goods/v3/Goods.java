package com.bit.javaex.oop.goods.v3;

public class Goods {
	//필드 선언
	// private 으로 접근 제한
	private String name;
	private int price;
	
	//생성잔
	//만약에 코드에 생성자가 하나도 없다면 컴파일러가 기본 생성자를 자동으로 추가
	//생성자는 반드시 1개가 있어야 한다
	public Goods(String name) {
		this.name=name;
	}
	public Goods(String name, int price) {
//		super();  //뷰모 생성자 호출 부모로부터 물려받은 필드 초기화
		//명시적으로 부모 생성자를 호출하지 않으면 컴파일러가 기본 부모 생성자를 끼워넣는다
//		this.name=name;
		this(name);
		this.price=price;
	}
	
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//
	/*
	public void setName(String name) {
		this.name = name;
		//this는 해당 인스턴스
	
	
	
	}

	public void setPrice(int price) {
		if(price > 0)
		this.price=price;
	}
	*/
	
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:"+ price);
	}

}
