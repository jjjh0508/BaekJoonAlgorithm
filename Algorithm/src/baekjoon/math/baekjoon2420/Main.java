package baekjoon.math.baekjoon2420;

import java.util.Scanner;

public class Main {

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
		sc.close();
	}

}
