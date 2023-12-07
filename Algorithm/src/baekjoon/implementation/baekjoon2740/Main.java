package baekjoon.implementation.baekjoon2740;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		int a[][];
		int b[][];
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[n][m];
		for(int j=0;j<n;j++) {
			for(int k=0;k<m;k++) {
				a[j][k] = sc.nextInt();
			}
		}
		int c = sc.nextInt();
		int d = sc.nextInt();
		b = new int[c][d];
		for(int j=0;j<c;j++) {
			for(int k=0;k<d;k++) {
				b[j][k] = sc.nextInt();
			}
		}
		/*
		 * 1X-1 +2X0        1X-2 + 2X0    1X0 + 2X3
		 *
		 * 3X-1 + 4X-0        3X-2 + 4X0   3X0+4X3    
		 * 
		 * */
		for(int i=0;i<n;i++) {   // A행열의 N개 까지 증가하고
			for(int j=0;j<d;j++) { //B행열의 M까지 증가 
				int sum =0;
				for(int k = 0 ; k<m;k++) {  //k는 A행열의 M까지만 증가한다
					sum += a[i][k] * b[k][j]; // k가 증가면서 행렬 A 1 2  b의 -1 0
				}											
				builder.append(sum).append(' '); // 배열로 행렬C를 생성하지 않고 빌더로 스트링 형태로 출력해도 된다
			}
			builder.append('\n');
		}
		System.out.println(builder);
	}

}
