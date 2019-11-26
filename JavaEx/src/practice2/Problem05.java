package practice2;

public class Problem05 {

	public static void main(String[] args) {
		int scoreboard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 }
		};
		
		int total = 0;	//	점수 합계 저장 변수
		int count = 0;	//	85점 이상 점수의 개수 저장 변수
		
		//	배열 내 85점 이상 점수 합 구하기
		for (int i = 0;i<scoreboard.length ;i++ ) {
			for (int j = 0;j<scoreboard.length ;j++ ) {
				if (scoreboard[i][j]>=85) {
					total += scoreboard[i][j];
					count++;
				}
			}
		}
		
		System.out.printf("85점 이상 점수의 총합은 %d, 평균은 %f 입니다.%n", total, (float)total / count);

	}

}
