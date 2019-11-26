package com.bit.javaex.thread.ex03;
	//Runnable 인터페이스를 구현한 쓰레드 클래스
public class AlphabetThread implements Runnable{

	@Override
	public void run() {
		for(char ch= 'A'; ch<='Z'; ch++) {
			System.out.println("AlphabetThread: " + ch);
			
			//출력 속도 제한: thread.sleep()
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} //0.3초 대기
		}
		
	}

}
