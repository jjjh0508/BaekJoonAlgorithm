package baekjoon.math.baekjoon5554;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int second =0;
		int minute = 0;
		for(int i =0;i<4;i++) {
			second += sc.nextInt();
		}
		
		minute= second/60;
		second = second%60;
		
		System.out.println(minute);
		System.out.println(second);
		sc.close();
	}

}
