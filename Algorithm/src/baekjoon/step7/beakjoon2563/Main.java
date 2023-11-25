package baekjoon.step7.beakjoon2563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int[][] color = new int[size][2];
//		int minus= 0;
//		int score = 100*size;
//		for(int i = 0 ; i< size; i++) {
//			for(int j =0 ; j<2;j++) {
//				color[i][j] = sc.nextInt();
//			}
//		}
//		for(int i = 0 ; i< size; i++) {
//			for(int j = 1 ; j <size; j++) {
//				if((color[i][0] < color[j][0]) && (color[j][0] <  color[i][0]+10)) {
//					if(color[i][1]< color[j][1]+10  && color[j][1]+10 < color[i][1]+10) {
//						minus += (color[i][0]+color[j][0])*(color[i][1]-color[j][1]);
//				
//					}
//				}
//			}
//		}
//		
//		score-=minus;
//		System.out.println(score);
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] dohaji = new int[100][100];
		int[][] color = new int[size][2];
		int count = 0;
		for(int i = 0 ; i< size; i++) {
			for(int j =0 ; j<2;j++) {
				color[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i< size; i++) {
			int x = color[i][0];
			int y = color[i][1];
			
			for(int j = x ; j < x+10; j++) {
				for(int k = y ; k<y+10 ; k++) {
					if(dohaji[j][k]!=1) {
						dohaji[j][k]=1;
						count++;
					}
				}
			}
		}
		System.out.println(count);
	
	}
}
