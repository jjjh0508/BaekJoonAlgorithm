package baekjoon.datastructures.baekjoon10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n; i++) {
		
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		for(int i =0 ; i < m ;i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr,num)-lowerBound(arr, num)).append(" ");
		}
		System.out.println(sb);
	}
	
	public static int lowerBound(int []arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		
		
		while (lo<hi) {
			int mid = (lo+hi)/2;
			
			if(key<=arr[mid]) {
				hi=mid;
			}else {
				lo=mid+1;
			}
			
		}
		return lo;
	}
	
	public static int upperBound(int [] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while (lo<hi) {
			int mid = (lo+hi)/2;
			if(key<arr[mid]) {
				hi=mid;
			}else {
				lo=mid+1;
			}
		}
		return lo;
	}

}
