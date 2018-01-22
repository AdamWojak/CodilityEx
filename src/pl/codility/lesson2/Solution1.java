package pl.codility.lesson2;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {

		int n = 5;
		int[] A = new int[n];

		A[0] = 2;
		A[1] = 4;
		A[2] = 3;
		A[3] = 2;
		A[4] = 3;

		System.out.println(solution(A));
	}

	public static int solution(int[] A) {

		int odd = A[0];
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));

		for (int i = 0; i < A.length; i = i + 2) {
			if (i > (A.length - 2)) {
				odd = A[A.length - 1];
				break;
			} else {
				if (A[i] == A[i + 1]) {

				} else if (A[i] != A[i + 1]) {
					odd = A[i];
					break;
				}
			}
		}
		return odd;
	}
}
