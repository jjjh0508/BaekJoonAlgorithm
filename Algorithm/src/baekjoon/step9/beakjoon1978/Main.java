package baekjoon.step9.beakjoon1978;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num[] = new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
	
		for(int i=0;i<n;i++) {
			boolean check = false;
			if(num[i]==1) {
				continue;
			}
			
			for(int j=2;j<num[i];j++) {
				if(num[i]%j==0) {
					check=true;
				}
				
			
			}
			if(check==false) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
