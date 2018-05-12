package kuaishou;

import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String arr = sc.nextLine();
			String[] A = arr.split(" ");
			int x = sc.nextInt();
			int result = solution(x,A);
			if (result<0) {
				System.out.println(A.length);
			}else {
				System.out.println(result);
			}
		}
		sc.close();
	}

	private static int solution(int x, String[] a) {
		// TODO Auto-generated method stub
		int num[]  = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			num[i] = Integer.valueOf(a[i]);
		}
		//如果A中所有数字都小于x，则返回-1,，如果A中的数字都大于x,则，返回下标0
		if (x>num[a.length-1]) {
			return -1;
		}else if(x<num[0]){
			return 0;
		}else{
		//如果x在数组A的范围之内，则执行二分查找
			int result = quicksort(x,num);
			while (result < 0) {
				x=x+1;
				result = quicksort(x, num);
			}
			return result;
		}
	}

	private static int quicksort(int x, int[] num) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = num.length-1;
		while (low <= high) {
			int 	mid = low + ( high - low)/2;
			if 				(x<num[mid])		high = mid-1;
			else if 	(x>num[mid])		low = mid+1;
			else 										return mid;
		}
		return -1;
	}

}
