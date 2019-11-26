package com.bit.javaex.oop;

//기본적으로 class나 interface등은 각자 개별 파일에 작성해주세요
abstract class Animal {
	// 추상 클래스이니 객체화는 불가
	// 필드

	protected String name;
	protected int age;

	// 생성자
	public Animal(String name) {
		this.name = name;
	}

	public Animal(String name, int age) {
		this(name);
		this.age = age;
	}

	// 메서드
	public void eat() {
		System.out.printf("%s is eating...%n", name);
	}

	public abstract void say(); // 반드시 오버라이드 해야 한다

}

class Human extends Animal {

//
	public Human(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.printf("안녕, 내 이름은 %s야%n", name);
	}
}

class Panda extends Animal {
	public Panda(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.println("zzz...");
	}

	
}
interface Kungfu {
	public void kungfu();
}

interface Flyable{
	public void fly();
	
}

class KungfuPanda extends Panda implements Kungfu {
	// 생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": 아뵤~!");

	}
}

class KungfuHuman extends Human implements Kungfu {
	//
	public KungfuHuman(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know kungfu!");
	}
}


class TheOne extends Human implements Kungfu, Flyable{
	//상속은 단을 부모로부터 박을 수있지만
	//인터페ㅣ스는ㄴ 여러개 구현할 수있다
	public TheOne(String name, int age) {
		super(name,age);
		
	}
	@Override
	public void fly() {
		System.out.println(name + ":하늘을 날 수있어요!");
		
		
	}
	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.println(name + "쿵후를 할수 있어요");
	} 
}

public class SummaryApp {

	public static void main(String[] args) {
		// 쿵후를 항ㄹ 수 있는 배열(도장)만들어
		Human h1 = new Human("홍길동", 28);
		Human h2 = new KungfuHuman("네오", 40);
		Panda p1 = new Panda("판다", 30);
		Panda p2 = new KungfuPanda("포", 15);

		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);

		// 쿵후 도장을 만들어 봅시다

		// 같은 인터페이스를 구현한 객체는 같은 인터페이스 타입으로 참조할 수있다
		Kungfu[] dojang = {
//				(Kungfu)h1,
				(Kungfu) h2,
//				(Kungfu)p1,
				(Kungfu) p2 };

		TheOne neo = new TheOne("네오", 40);
		neo.fly();
	}

	public static void fight(Animal a) {
		//대련
		//객체가 인터페이스를 구현한 객체인지 먼저 확인
		if(a instanceof Kungfu) {
			((Kungfu)a).kungfu();
		}else
		System.out.println((a.name + ": 쿵후 못해요!"));
		
	}

}
