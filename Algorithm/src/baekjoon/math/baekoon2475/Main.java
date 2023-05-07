package baekjoon.math.baekoon2475;

import java.util.Scanner;

/*
 * 주어진수를 제곱해서 더하고 10으로 나눈 나머지가 검증수
 * 크기가 5인 int 배열 각각 자기끼리 곱해서 더한다
 */
public class Main {

	public static void main(String[] args) {
		int [] arr = new int[5];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length;i++) {
			arr[i]*=arr[i];
			sum+=arr[i];
		}
		System.out.println(sum%10);
	}

}
