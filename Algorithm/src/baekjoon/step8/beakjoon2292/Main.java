package baekjoon.step8.beakjoon2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int six= 6;
		int count = 2;
		int j = 1;
	
		if(num ==1) {
			System.out.println(1);
		}else {
			for(int i = 2; i<=num;i++) {
				if(i>six+j) {
					six = (6*count);
					count++;
					j=i-1;

				}
				
			}
			System.out.println(count);
		}
		
	}

}
