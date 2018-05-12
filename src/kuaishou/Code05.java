package kuaishou;

import java.util.Scanner;

public class Code05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine().toString();
			String[] stringArr = input.split(" ");// �ո���
			int[] num = new int[stringArr.length];// �����������飬�洢����
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(stringArr[i]);
			}
			int key = sc.nextInt();// Ŀ������
			int result = findFirstEqualLarger(num, key);
			System.out.println(result);
		}
		sc.close();
	}

	private static int findFirstEqualLarger(int[] num, int key) {
		int left = 0;
		int right = num.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (num[mid] >= key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

}
