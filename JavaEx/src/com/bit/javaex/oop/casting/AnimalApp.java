package com.bit.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		Dog d= new Dog("snoopy");
		d.walk();
		d.eat();
		d.bark();
		
		Animal pet=d; // upcasting
		//자식 인스턴스를 부모 클래스 타입으로 참조하는 것
		pet.walk();
		pet.eat();
//		pet.bark(); //불가능
		
		pet=new Cat("아즈라엘");
		pet.walk();
		pet.eat();
		
		//다운캐스팅
		//부모타입으로 참조하고 있는 것을
		//다시 원래 클ㄹ스 타입으로 돌려 놓는 것
		((Cat)pet).meow();
		
		//다운캐스팅 할 경우
		//해당 인스턴스가 특정 클래스의 객체인지를 확인
		if(pet instanceof Dog) {
			((Dog)pet).bark();
			
		}else {
			System.out.println("개 아닌데요!");
		}
		
		

	}

}
