package baekjoon.step4.baekjoon10813;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		int[] ball = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			ball[i]= i+1;
		}
		
		for(int i = 0 ; i < m ; i ++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int temp = ball[x-1];
			ball[x-1] = ball[y-1];
			ball[y-1] = temp;
			
		}
		
		for(int i = 0 ; i < n ; i ++ ) {
			System.out.print(ball[i]+ " ");
			
		}
	}

}
