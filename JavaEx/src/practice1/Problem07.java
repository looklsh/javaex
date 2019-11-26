package practice1;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			String retry;
			int num = (int) (Math.random() * 100) + 1;
			int inputNum = 0;

			System.out.println("========================");
			System.out.println("    [숫자맞추기게임 시작]");
			System.out.println("========================");
			while (true) {

				System.out.print(">>");
				// 사용자 입력값 받기
				inputNum = sc.nextInt();

				// 입력한 값 높은지 낮은지 맞추었는지 판단
				if (inputNum == num) {
					System.out.println("맞았습니다");
					break;
				} else if (inputNum > num) {
					System.out.println("더 낮게");
					continue;
				} else if (inputNum < num) {
					System.out.println("더 높게");
					continue;
				}

			}
			sc.nextLine();
			
			System.out.println("게임을 종료하시겠습니까?(y/n) >>");
			retry=sc.next();
			if("y".equals(retry)) {
				
				System.out.println("========================");
				System.out.println("    [숫자 맞추기 종료]");
				System.out.println("========================");
				break;
				
			}else {
				continue;
			}
			
		}
		sc.close();
	}
	
}
