package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElse2Ex {

	public static void main(String[] args) {
		System.out.println("1: C, 2: C++, 3: Java");
		//
		//
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("과목명:");
		
		int subject = scanner.nextInt();
		String message;
		
		//조건판별
		if(subject == 1) {
			message = "R101";
		}else if(subject == 2) {
			message = "R102";
		}else if(subject == 3) {
			message = "R103";
		}else {
			message = "문의 바람";
		
		}
		System.out.println(message);
		scanner.close();

	}//

}//
