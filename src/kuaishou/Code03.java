package kuaishou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int T = sc.nextInt();// 数据组数
			int[] num = new int[T];
			for (int i = 0; i < num.length; i++) {
				int temp = sc.nextInt();
				num[i] = temp;
			}
			for (int i = 0; i < num.length; i++) {
				if (num[i] < 10) {
					System.out.println(num[i]);
				} else {
					List<String> list = new ArrayList<>();
					for (int j = 1; j <= num[i]; j++) {
						String chr = String.valueOf(j);
						list.add(chr);
					}
					int count = 0;
					for (int j = 0; j < list.size(); j++) {
						int temp = list.get(j).length();
						count += temp;
					}
					System.out.println(count);
				}
			}
		}
		sc.close();
	}

}
