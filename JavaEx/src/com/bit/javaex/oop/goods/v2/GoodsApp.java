package com.bit.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
//		camera.name = "Samsung";
//		camera.price = 400000;
		camera.setName("Samsung");
		camera.setPrice(400000);

		// System.out.println("Camera: " + camera);
//		System.out.printf("Camera: %s, %d원%n",  camera.getName(),
//		         camera.getPrice());

		camera.showInfo();
		Goods notebook = new Goods();
//		notebook.name = "LG 그램";
//		notebook.price = 900000;
		notebook.setName("LG 그램");
		notebook.setPrice(900000);
//		System.out.printf("Notebook: %s, %d원%n",notebook.getName(), notebook.getPrice());
		notebook.showInfo();
	}

}

//
