package practice1;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		int max =0;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int[] arr = new int[5];
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자: ");
			arr[i] = sc.nextInt();
			
			
			if (max < arr[i]) {
				max = arr[i];
				
				
			}

		}
		

		System.out.println("최댓값은" + max + "입니다.");

	}

}
