package kuaishou;

import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long x = sc.nextLong(), y = sc.nextLong(), N = sc.nextLong();//输入三个数X,Y,Z
			long result = 1;
			x = x % N;
			while (y > 0) {
				if (y % 2 == 1)
					result = (result * x) % N;
				y /= 2;
				x = (x * x) % N;
				}
			System.out.println(result);
		}
		sc.close();
	}
}
