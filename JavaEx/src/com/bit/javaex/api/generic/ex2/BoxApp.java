package com.bit.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		//박스 클래스 테스트
		Box<Integer> intBox=new Box<>();
		intBox.setContent(2019);
		//intBox.setContent("String); //안됨: 내부데이터는 인티저형
		
		//내용물을 꺼내봅시다
		//내용물의 타입을 객체 생성시 지정했기 때문에 다운 캐스팅이 필요없다
		int retVal=intBox.getContent();
		System.out.println(retVal);
		
		Box<String> strBox=new Box<>();
		strBox.setContent("Java");
		
		String strVal=strBox.getContent();
		//출력
		System.out.println(strVal);
		//object타입을 데이터 참조하게되면
		//캐스팅 문제등 여러 부가적인 문제가 발생
		
		//만약에 캐스팅을 잘못했다면?
		//Generic으로 만든 클래스는 내부 데이터 타입을 강제 했기 때문에
		//컴파일 타임에서 캐스팅 오류룰 잡아낼 수 있다.
//		strVal=(String)intBox.getContent();
	}

}
