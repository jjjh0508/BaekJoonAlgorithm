package baekjoon.datastructures.baekjoon10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ;i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i<m ; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(arr, num)).append(" ");
		}
		System.out.println(sb);

	}
	
	
	public static int binarySearch(int[] arr , int key){
		int lo = 0;
		int hi = arr.length-1;
		
		while (lo<=hi) {
			int mid = (lo+hi)/2;
			if(key<arr[mid]) {
				hi = mid-1;
			}else if(key>arr[mid]) {
				lo=mid+1;
			}else {
				return 1;
			}
			
		}
		return 0;
		
	}

}
