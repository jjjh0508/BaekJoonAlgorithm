package baekjoon.datastructures.baekjoon1920;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[]  arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);              //반드시 정렬되어있어야한다
		int m = sc.nextInt();
		for(int i = 0 ; i<m;i++) {
			if(binarySearch(arr, sc.nextInt())>=0) {     // 0 인덱스가 넘어올수도 있으니 크거나 같다
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		
		}
		System.out.println(sb);

	}
	
	public static int binarySearch(int[] arr, int key) {
		int lo = 0;                  //제일 왼쪽 인덱스
		int hi = arr.length-1;       //제일 오른쪽 인덱스
		
		while(lo<=hi) {
			int mid = (lo+hi)/2;     //중앙
			
			if(key<arr[mid]) {
				hi = mid-1;          //정렬 되어있기 떄문에 중간 값이 key값보다 크면 중간 제일 오른쪽 인덱스를 mid-1로 바꾼다
			}else if(key>arr[mid]) {
				lo = mid+1;          //key가 더 큰 경우 왼쪽을 mid+1로 바꾸고 그 이상부터 다시 조회
			}else {
				return mid;
			}
		}
		return -1;
	}

}
