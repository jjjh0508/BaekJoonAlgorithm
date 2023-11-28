package baekjoon.step9.beakjoon2501;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n  = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] num = new int[n];
		
		for(int i=1;i<=n;i++) {
			int sub = n % i;
			if(sub==0) {
				num[i-1]=i;
			}
		}
		for(int i=0;i<n;i++) {
			
			if(num[i]>0) {
				count++;
			}
			if(count==k) {
				System.out.println(num[i]);
				break;
			}
		}
		
		if(count<k) {
			System.out.println(0);
		}
		
	}

}
