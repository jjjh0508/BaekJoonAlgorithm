package baekjoon.step9.beakjoon2581;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum =0;
		int min = 10001;
		if(m==1) {
			m++;
		}
		for(; m<=n;m++) {
			boolean check = true;
			for(int j = 2 ; j<m;j++) {
				if(m%j==0) {
					check=false;
					break;
				}
			}
	
			if(check) {		
				if(min>m) {
					min=m;
				}
				sum+=m;
			}
		}
		if(sum==0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
			
		}
	
	}

}
