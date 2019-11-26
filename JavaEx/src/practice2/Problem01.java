package practice2;

public class Problem01 {

	public static void multi() {
		String[] num;
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int k = 0;
		int sum=0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {
				k++;
				sum += data[i];
				
			}

			
		}System.out.println("주어진 배열에서 3의 배수 개수" + "=>" + k + sum);

	}

	public static void main(String[] args) {
		multi();

	}

}
