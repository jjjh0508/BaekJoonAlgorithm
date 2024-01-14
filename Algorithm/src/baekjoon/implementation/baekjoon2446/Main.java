package baekjoon.implementation.baekjoon2446;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		sc.close();
		for(int i = 0 ; i<n;i++) {
			for(int j= 0 ; j<i;j++ ) {
				sb.append(" ");
			}
			
			for(int j=0 ;j < (2*n-1)-(2*i); j++) { 
				sb.append("*");
			}
			
			sb.append("\n");
			
		}
		
		for(int i = 0 ; i<n-1;i++) {       //0 1 2 3 4 
			for(int j=0 ; j<(n-2)-i;j++) { //공백  i=0일 때  1 2 3 i=1일때 1 2 
				sb.append(" ");
			}
			for(int j = 0 ; j<3+(2*i);j++ ) { //i=0 일때 0 1 2 i=1일때 0 1 2 3 4
				sb.append("*");
			}
			sb.append("\n");
		}
		
		
		System.out.println(sb);
	}

}
