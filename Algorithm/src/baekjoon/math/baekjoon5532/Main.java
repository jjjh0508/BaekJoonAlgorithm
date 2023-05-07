package baekjoon.math.baekjoon5532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		for(int i=1;i<=l;i++) {
			a-=c;
			b-=d;
			if(a<=0&&b<=0) {
				System.out.println(l-i);
				break;
			}
		}
		sc.close();
	}

}
