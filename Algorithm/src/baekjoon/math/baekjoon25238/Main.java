package baekjoon.math.baekjoon25238;

import java.util.Scanner;
/*
 * (a*100)-(a*b)<10000)
 *  b*0.01
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if((a*100)-(a*b)<10000) {
			System.out.println(1);
		
		}else {
			System.out.println(0);
		}
		sc.close();
	}

}
