package baekjoon.prefixsum.baekjoon11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] num = new long[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i<=n ;i++) {
			num[i] =num[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int k = 0 ; k < m ; k++) {
			st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int scond = Integer.parseInt(st.nextToken());
	
			
			sb.append(num[scond]-num[first-1]).append("\n");
		}
		
		System.out.println(sb);
		

	}

}
