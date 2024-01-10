package baekjoon.math.baekjoon1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean[] num = new boolean[n+1];
		Arrays.fill(num, true);
		num[0] = false;
		num[1] = false;
		if(n<2) {
			return;
		}
		for(int i = 2 ; i<= n ; i++) {
			if(num[i]) {
				for(int j = i+i ; j<=n ; j+=i) {
					num[j] = false;
				}
			}
		}
		
		for(int i = m ; i <= n ; i++) {
			if(num[i]) {
				sb.append(i).append("\n");
			}
			
		}
		System.out.println(sb);
	}

}
