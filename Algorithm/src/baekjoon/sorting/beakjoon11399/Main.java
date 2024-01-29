package baekjoon.sorting.beakjoon11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int sum = 0;
		int prev =0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i = 0 ; i < n;i++) {
			sum+= prev+arr[i];               // 0+1 , 1+2    3+3   6+3   9+4
			
			prev +=arr[i];                   // 1       3     6     9    13
		}
		
//		for(int i = 0 ; i < n ; i++) {   //0   1    2   3   4
//			for(int j=0;j<i+1;j++) {     //1   2    3   4   5
//				sum+=arr[j];             //1   3    6   9   13
//			}
//		}
//		
		
		
		System.out.println(sum);

	}

}
