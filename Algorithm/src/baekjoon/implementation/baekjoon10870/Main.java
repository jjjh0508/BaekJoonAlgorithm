package baekjoon.implementation.baekjoon10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n+1];
		num[0] = 0;
		num[1] = 1;
		
		for(int i = 2 ; i<=n ;i++) {
			num[i] = num[i-2]+num[i-1];
		}
		
		
		System.out.println(num[n]);
	

	}

}
