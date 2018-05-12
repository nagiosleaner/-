package kuaishou;

import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int N = sc.nextInt();
			System.out.println((int)Math.pow(x, y)%N);
		}
		sc.close();
	}

}
