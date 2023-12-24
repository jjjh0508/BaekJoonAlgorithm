package baekjoon.implementation.baekjoon2455;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max = 0;
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for(int i= 0 ; i <4;i++) {
			int down = sc.nextInt();
			int board = sc.nextInt();
			score-=down;
			score+=board;
			if(score>max) {
				max=score;
			}
		}
		
		System.out.println(max);
	}

}
