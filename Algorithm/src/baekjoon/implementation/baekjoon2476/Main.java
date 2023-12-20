package baekjoon.implementation.baekjoon2476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] sum= new int[n];
		for(int i=0;i<n;i++) {
			int[] num = new int[3];
			st= new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				num[j]= Integer.parseInt(st.nextToken());
			}
			if(num[0]==num[1] && num[0] ==num[2]) {
				sum[i] = 10000+num[1]*1000;
			}else if(num[0]==num[1] || num[0] ==num[2] || num[1] ==num[2]) {
				int dice = num[0]==num[1] ? num[0] : num[0] ==num[2] ? num[0] : num[2];
				sum[i] = 1000+dice*100;
			}else {
				Arrays.sort(num);
				sum[i]=num[2]*100;
			}
			
		}
		Arrays.sort(sum);
		System.out.println(sum[n-1]);
		

	}

}
