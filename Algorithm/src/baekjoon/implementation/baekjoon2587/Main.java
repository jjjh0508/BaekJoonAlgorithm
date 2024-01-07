package baekjoon.implementation.baekjoon2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 5;
		int[] arr = new int[n];
		int sum = 0;
		for(int i = 0 ; i< n ; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i]=a;
			sum+=a;
		}
		Arrays.sort(arr);
		sb.append(sum/5).append("\n");
		sb.append(arr[2]);
		System.out.println(sb);
		
	}

}
