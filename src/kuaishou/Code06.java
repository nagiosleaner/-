package kuaishou;

import java.util.Scanner;

public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			for (int i = str.length()-1; i >=0; i--) {
				System.out.print(str.charAt(i));
			}
		}
		sc.close();
	}

}
