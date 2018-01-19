package pl.codility.lesson2;

import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {

		int[] A = { 3, 8 };
		int K = 5;

		System.out.println(Arrays.toString(solution(A, K)));
	}

	public static int[] solution(int[] A, int K) {

		int[] arrTemp = new int[A.length];

		if (A.length < 2) {
			return A;
		} else {

			if (K > A.length) {
				K = K % A.length;
				System.out.println(K);
			}

			for (int i = 0; i < A.length; i++) {
				if (i < A.length - K) {
					arrTemp[i + K] = A[i];
				} else {
					arrTemp[((i + K) - A.length)] = A[i];
				}
			}
			return arrTemp;
		}
	}
}
