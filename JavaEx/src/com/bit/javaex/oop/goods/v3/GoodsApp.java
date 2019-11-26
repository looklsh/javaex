package com.bit.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods camera = new Goods(); //사용자 정의 생성자 있어서 컴팡일러가 기번 생성자를 끼워너지 않음
//		camera.name = "Samsung";
//		camera.price = 400000;
//		camera.setName("Samsung");
//		camera.setPrice(400000);
		//생성자를 이용한 초기화
		Goods camera=new Goods("Samsung", 400000);

		// System.out.println("Camera: " + camera);
//		System.out.printf("Camera: %s, %d원%n",  camera.getName(),
//		         camera.getPrice());

		camera.showInfo();
		Goods notebook=new Goods("LG 그램",900000);
//		Goods notebook = new Goods();
//		notebook.name = "LG 그램";
//		notebook.price = 900000;
//		notebook.setName("LG 그램");
//		notebook.setPrice(900000);
////		System.out.printf("Notebook: %s, %d원%n",notebook.getName(), notebook.getPrice());
		notebook.showInfo();
		
		
//	notebook.setPrice(9000); //price필드는 read only
//		notebook.showInfo();
		
	}

}

//
