package baekjoon.math.baekjoon3046;

import java.util.Scanner;

/*
 * 수 하나와 평균값을 주는데
 * 나머지 수를 구해라 
 *  평균*2 - r1 하면 나머지 값이 나온다
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 =sc.nextInt();
		int s = sc.nextInt();
		sc.close();
	
		System.out.println((s*2)-r1);
	}

}
