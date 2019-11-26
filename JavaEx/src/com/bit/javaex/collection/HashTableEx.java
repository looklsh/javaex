package com.bit.javaex.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {
	// 해쉬테이블은 키 - 값의쌍
	// 키를 기반으로 값을 검색(해쉬 계열)
	public static void main(String[] args) {
		Map<String, ClassRoom> map = new Hashtable<>();

		// 맵에 데이터 넣기
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("201", new ClassRoom("C++", "R201"));
		// 키 중복은 허용하지 않고 나중에 put한 객체가 value로 사용

		System.out.println("Map:" + map);

		// 키가 있는 지확인: containskey
		System.out.println("KEY 101:" + map.get("101"));
		System.out.println("KEY 501:" + map.get("501")); // null

		// 키로 값에 접근
		ClassRoom c = map.get("101");
		System.out.println("101 강의실" + c);

		// 값이 있는지 확인: containsvalue
		// 값중에 Java 강의 실이 있는지
		System.out.println("containsvalue:" + map.containsValue(new ClassRoom("Java")));

		// hashtable의 키 목록은 hashset
		// hashtable 내의 키set 반환 받은 후 iterator를 받을 수 있다
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			ClassRoom room = map.get(key);
			System.out.println("ROOM(IT):" + room);
		}

		map.clear();
		System.out.println("Map:" + map);

	}
}
