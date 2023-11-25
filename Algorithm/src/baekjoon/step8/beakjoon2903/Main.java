package baekjoon.step8.beakjoon2903;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int score = 0;
		int point = 2;
		for(int i = 1 ; i<=num ; i++) {
			if(i==1) {
				point+=i;
				score = point*point;
			}else {
				point+= (int)Math.pow(2, i-1);
				score = point*point;
				
			}
		}
		System.out.println(score);
	}

}
