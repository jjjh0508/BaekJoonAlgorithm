package baekjoon.step3.beakjoon25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c=0;
		for(int i=1;i<=b;i++) {
			int d =sc.nextInt();
			int e =sc.nextInt();
			c+=d*e;
		}
		if(a==c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
