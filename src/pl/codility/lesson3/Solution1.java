package pl.codility.lesson3;

public class Solution1 {

	public static void main(String[] args) {

		// int[] A = { 3, 1, 2, 4, 3 };
		// int[] A = {-1000, 1000};
		int[] A = { -10, -5, -3, -4, -5 };

		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		int sum = 0;
		int absolute = 0;

		for (int i : A) {
			sum += i;
			int element = (int) Math.sqrt(Math.pow(i, 2));
			absolute = absolute + element;
		}

		int max = absolute;
		int tempValue;
		int actualSum = 0;

		for (int i = 0; i < A.length - 1; i++) {
			actualSum += A[i];
			tempValue = (int) Math.sqrt(Math.pow((actualSum - (sum - actualSum)), 2));
			if (tempValue <= max) {
				max = tempValue;
			}

		}
		return max;
	}

}
