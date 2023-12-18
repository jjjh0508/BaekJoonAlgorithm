package baekjoon.implementation.baekjoon10826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger[] num = new BigInteger[n+1];
		
		if(n>0) {
			num[0]= BigInteger.valueOf(0);
			num[1]= BigInteger.valueOf(1);
			
			for(int i =2 ;i<=n ; i++) {
				num[i] = num[i-1].add(num[i-2]);
			}
		}else {
			num[0]= BigInteger.valueOf(0);
		}
		
		System.out.println(num[n]);
	
		
		
	}

}
