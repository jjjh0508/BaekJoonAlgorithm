package baekjoon.math.baekjoon2960;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[1001];
		Arrays.fill(arr, true);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0; 
		for(int i = 2 ; i<=N ;i++) {
			for(int j = i; j<=N;j+=i) {
				if(arr[j]) {
					arr[j]= false;
					count++;
				}
			
				if(count==K) {
					System.out.println(j);
					return;
				}
			}
		}
	}

}
