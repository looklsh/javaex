package com.bit.javaex.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	//queue: 파이프를 떠올리자
			//입력방향과 출력방향이 반대
			//중간에 값을 넣고 뺄수 없다

	public static void main(String[] args) {
		//queue만들자
		//큐는 클래스가 아니라 인터페이스
		//실제 클래스는 LinkedList의 저장기능을 그대로 이용
		Queue<Integer> queue=new LinkedList<>();
		
		//데이터를 제공
		for(int i=0;i<=10;i++) {
			queue.offer(i); //
			
		}
		System.out.println("QUEUE:"+ queue);
		
		//가장 처음 임력된 값을 확인
		int out=queue.peek();
		System.out.println("OUT:" + out);
		System.out.println("QUEUE:" + queue);
		
		//데이터 끄집어 내기 : poll()
		out=queue.poll(); // 데이터를 끄집어 내고 큐로부터 삭제
		System.out.println("POLL:" + out);
		System.out.println("QUEUE:" + queue);
		
		//루프를 돌면서 전체 데이터를 꺼내봅시다
		while(!queue.isEmpty()) {
			System.out.println("POLL:" + queue.poll());
			System.out.println("QUEUE" + queue);
		}

	}

}
