package baejoon;

import java.util.Scanner;

public class BaeJoon2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		long sum =0;
		if(n-m<0) {
			sum= -(n-m);
		}else {
			sum = (n-m);
		}
		System.out.println(sum);
	}

}
