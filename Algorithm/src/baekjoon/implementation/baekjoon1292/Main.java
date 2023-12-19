package baekjoon.implementation.baekjoon1292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] num = new int[1000];
		int cnt = 0;
		for(int i = 1 ; i <1000;i++) {
			for(int j = 0 ; j<i ; j++) { // i 5 고 j가 0 인 상태로 증가를 하면
				if(cnt == 1000) {		// num[cnt]= 5가 j가 0부터 5까지 증가하면서 5를 넣는다
					break;
				}
				num[cnt]=i;
				cnt++;
				
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int sum = 0;
		for(int i = a-1; i < b;i++) {
			sum+=num[i];
		}
		
		System.out.println(sum);
	}

}
