package baekjoon.step10.beakjoon1085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x= sc.nextInt();
		int y= sc.nextInt();
		int w= sc.nextInt();
		int h= sc.nextInt();
		
		int min = 1000;
		
		int a =  x>y ? y:x;
		int b =  w-x > h-y ? h-y: w-x;
		
		min= a>b ? b:a;
		
		
		System.out.println(min);

	}

}
