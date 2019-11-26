package com.bit.javaex.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
		//List 인터페이스
		//List는 설계도
		//실제 클래스는 LinkedList, ArraysList등오로 구현되야 한다
		//LinkedList :중간에 값이 빈번하게 삽입  삭제되는 경우 효율적
		//ArraysList
			
	public static void main(String[] args) {
//		List<String>list= new LinkedList<>();
		List<String>list= new ArrayList<>(); //교체 가능성
		//객체추가
		list.add("Java"); //맨 마지막에 아이템 추가
		list.add("Python");
		list.add("C");
		list.add("C++");
		
		//객체삽입
		list.add(2,"Linux");
		System.out.println("list:"+list);
		System.out.println("size of list:"+list.size());
		//size는 잡을 수있으나 용량(capacity)은 확인할 수 없다
		
		//객체삭제
		list.remove(2); //인덱스로 삭제
		list.remove("Python"); //객체 삭제
		list.remove("C#");//없는 객체 삭제
		
//		//루프
//		for(String item: list) {
//			System.out.println("Element:" + item);
//		}
		//Iterator를 이용한 접근
		//나중에 좀 더 나은 방식으로 루프
		Iterator<String> it= list.iterator(); //이터레이터 변환
		while(it.hasNext()) {
			String item= it.next();
			System.out.println("Element(it):" + item);
		}
			
		
		
		
		
		//비우기
		list.clear();
		System.out.println("list:"+list);

	}

}
