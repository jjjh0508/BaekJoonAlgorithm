package baekjoon.step3.beakjoon25314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int num2= num/4;
		for(int i=1;i<=num2;i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		sc.close();
	}
}
