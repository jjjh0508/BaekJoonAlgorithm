package baekjoon.step10.beakjoon9063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maxX = -10000;
		int minX = 10000;
		int maxY = -10000;
		int minY = 10000;
		
		
		for(int i = 0 ; i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			//Math.Max(MaxX,x)
			maxX = x> maxX ? x:maxX;
			//Math.Min(minX,x)
			minX = minX> x ? x:minX;
			
			maxY = y> maxY ? y:maxY;
			minY = minY> y ? y:minY;
		}
		
		System.out.println((maxX-minX)*(maxY-minY));

	}

}
