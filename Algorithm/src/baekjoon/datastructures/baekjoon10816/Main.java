package baekjoon.datastructures.baekjoon10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] arr1 = new int[20000002];
		st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i<n ; i++ ) {
			int num = Integer.parseInt(st.nextToken());
			arr1[num+10000001]=arr1[num+10000001]+1;
		}
	
		int m = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i<m ; i++ ) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(arr1[num+10000001]).append(" ");
		}
		
		System.out.println(sb);

	}

}
