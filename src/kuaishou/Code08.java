package kuaishou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] strA = sc.nextLine().split(",");
			String[] strB = sc.nextLine().split(",");
			int[] numA = str2int(strA);
			int[] numB = str2int(strB);
			solution(numA, numB);
		}
		sc.close();
	}

	private static int[] str2int(String[] str) {
		// TODO Auto-generated method stub
		int[] num = new int[str.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		return num;
	}

	private static void solution(int[] numA, int[] numB) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		List<Integer> link = new ArrayList<>();
		while (i < numA.length && j < numB.length) {
			if (numA[i] != numB[j]) {
				if(numA[i] < numB[j]){
					link.add(numA[i]);
					i++;
				}else {
					link.add(numB[j]);
					j++;
				}
			}else {
				link.add(numA[i]);
				i++;
				j++;
			}
		}
		if (i<numA.length) {
			for (int k = i; k < numA.length; k++) {
				link.add(numA[k]);
			}
		}
		if (j<numB.length) {
			for (int k = j; k < numB.length; k++) {
				link.add(numB[k]);
			}
		}
		for (int k = 0; k < link.size(); k++) {
			if (k==link.size()-1) {
				System.out.print(link.get(k));
			}else {
				System.out.print(link.get(k)+",");
			}
		}
		
	}

}
