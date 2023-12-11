package baekjoon.math.baekjoon1094;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[]num = {64,32,16,8,4,2,1};
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		for(int i=0;i<num.length;i++) {
			if(x>=sum+num[i]) {
				sum+=num[i];
				count++;
			}
			
			if(x==sum) {
				break;
			}
			
		}
		
		System.out.println(count);
		
	}

}
