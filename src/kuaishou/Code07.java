package kuaishou;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] str = sc.nextLine().split("\\s+");
			int len = str.length;
			int[] num = new int[len];
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(str[i]);
			}
			int result = maxSum(num);
			System.out.println(result);
		}
		sc.close();
	}

	private static int maxSum(int[] num) {
		// TODO Auto-generated method stub
		if (num == null || num.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int cur = 0;
		for (int i = 0; i != num.length; i++) {
			cur += num[i];
			max = Math.max(max, cur);
			cur = cur < 0 ? 0 : cur;
		}
		return max;
	}

}
