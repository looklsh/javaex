package practice1;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0 ;
		int j;
		//코드작성
		for(int i=1; i<=num; i++) {
			
				if(i%2==0) {
					sum += i;
			}else if(i%2==1){
				
			}
				
			
			
			
		}
		
		System.out.println("결과값: " + sum);
		sc.close();

	}

}
