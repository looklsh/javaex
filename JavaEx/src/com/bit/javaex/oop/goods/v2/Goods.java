package com.bit.javaex.oop.goods.v2;

public class Goods {
	//필드 선언
	// private 으로 접근 제한
	private String name;
	private int price;
	
	// Getter와 Setter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
		//this는 해당 인스턴스
	
	
	
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품이름:" + name);
		System.out.println("가격:"+ price);
	}

}
