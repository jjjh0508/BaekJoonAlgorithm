package baekjoon.step9.beakjoon5086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flog = false;
		
		while (!flog) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			if(a==0 & b ==0) {
				flog=true;
			}else {
				if(a>b) {
					int ab = a%b;
					if(ab == 0) {
						System.out.println("multiple");
					}else {
						System.out.println("neither");
					}
				}else {
					int ba = b%a;
					if(ba == 0) {
						System.out.println("factor");
					}else {
						System.out.println("neither");
					}
				}
			}
			
			
		}
		
	}

}
