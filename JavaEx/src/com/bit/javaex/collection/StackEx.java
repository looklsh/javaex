package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	//Stack
	// last input first output

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//스택은 벡터를 상속해서 만듬  :버퍼가 있는 자료형
		//루프를 돌면서 스택에 갑을 집어 넣어봅시다
		for(int i=1;i<=10;i++) {
			stack.push(i); // 스택에 인풋
			
		}
		System.out.println("STACK:" + stack);
		
		//가장 마지막 값을 확인 :peek
		int out= stack.peek();
		System.out.println("가장 마지막 입력값:" + out);
		System.out.println("STACK:" + stack);
		
		out=stack.pop();
		System.out.println("POP:" + out);
		System.out.println("STACK:" + stack);
		
		//루프를 돌면서 데이터를 pop
		while(!stack.empty()) {
			//비어있는 스택에서 데이터를 pop할 경우 익셉션 발생
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}
		

	}

}
