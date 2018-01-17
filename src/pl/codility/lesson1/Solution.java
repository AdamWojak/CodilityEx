package pl.codility.lesson1;

public class Solution {

	public static void main(String[] args) {

		int number = 6;
		System.out.println(solution(number));

	}

	public static int solution(int N) {

		String binaryStr = Integer.toBinaryString(N);
		System.out.println(binaryStr);
		char[] binaryArr = binaryStr.toCharArray();

		int max = 0;
		int maxRound = 0;
		for (int i = 0; i < binaryArr.length; i++) {
			if (binaryArr[i] == '1') {
				int counter = 0;
				for (int j = i + 1; j < binaryArr.length; j++) {

					if (binaryArr[j] == '0') {
						counter++;
					} else if (binaryArr[j] == '1') {
						maxRound = counter;
						break;

					}

					else {
						break;
					}

				}
				if (max < maxRound) {
					max = maxRound;
				}
			}

		}
		return max;
	}
}
