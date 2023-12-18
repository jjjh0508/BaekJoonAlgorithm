package baekjoon.implementation.baekjoon2748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long[] num = new long[n+1]; 
		
		if(n>0) {
			num[0] = 0;
			num[1] = 1;
			
			for(int i = 2 ; i<=n ; i++) {
				num[i] = num[i-1]+num[i-2];
			}
		}else {
			num[0]=0;
		}
		
		System.out.println(num[n]);
		
		
		
	}

}
