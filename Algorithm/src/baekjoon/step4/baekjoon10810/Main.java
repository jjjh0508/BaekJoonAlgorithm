package baekjoon.step4.baekjoon10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int M= sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=1;i<=M;i++) {
			int a = sc.nextInt();
			int b =sc.nextInt();
			int n =sc.nextInt();
			for(int j=a-1;j<b;j++) {
				arr[j]=n;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
