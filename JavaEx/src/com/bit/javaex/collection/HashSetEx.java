package com.bit.javaex.collection;

import java.util.HashSet;

public class HashSetEx {
	// Hashset(집합)
	// 순서는 중요하지 않고, 내부 데이터는 중복삽입되지 않는다
	public static void basicHashSet() {
		//
		//
		HashSet<String> hs = new HashSet<>();
		// 객체추가
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");// 중복삽입

		System.out.println(hs);
		System.out.println("SIZE:" + hs.size());

		// 포함 여부 확인:contains
		System.out.println(hs.contains("C++"));
		System.out.println("없는 데이터의 확인:" + hs.contains("Linux"));

		// 객체 삭제
		hs.remove("C++");
		System.out.println("SET:" + hs);

		// 셋 비우기
		hs.clear();
		System.out.println("SET:" + hs);

	}

	public static void customClassHashSet() {
		// 사용자 정의 클래스를 HashSet에
		HashSet<Student> hs = new HashSet<>();

		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("홍길동", 10);

		// HashSet에 담아봅시다
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println("HashSet:" + hs);
		// s1,s2해쉬코드 확인
		System.out.println("hashcode of s1:" + s1.hashCode());
		System.out.println("hashcode of s2:" + s2.hashCode());
		// 해쉬코드
		// 빠른 검색을 위해 객체를 식별하기 위한 하나의 정수값
		// 자바의 object클래스는 해쉬코드로 메모리 주소값을 쓴다

		// 만약에 Student 객체가 이름과 id가 같ㄷㅏ면 동등객체로 확인
		// 같은 값을 가진 객체가 넘어올때 중복 삽입을 막을 수 있다

	}

	public static void main(String[] args) {
		// basicHashSet();
		customClassHashSet();

	}

}
