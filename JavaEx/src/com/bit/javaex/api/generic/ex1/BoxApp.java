package com.bit.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		//박스 클래스 테스트
		Box intBox=new Box();
		intBox.setContent(2019);
		
		//내용물을 꺼내봅시다
		int retVal=(int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox=new Box();
		strBox.setContent("Java");
		
		String strVal=(String)strBox.getContent();
		//출력
		System.out.println(strVal);
		//object타입을 데이터 참조하게되면
		//캐스팅 문제등 여러 부가적인 문제가 발생
		
		//만약에 캐스팅을 잘못했다면?
		strVal=(String)intBox.getContent();
	}

}
