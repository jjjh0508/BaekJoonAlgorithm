package baekjoon.step9.beakjoon11653;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		
		if(num==1) {
			System.out.println("");
		}
		
		while (num!=1) {
			for(int i = 2 ; i<=num;i++) {
				if(num%i==0) {
					num/=i;
					System.out.println(i);
					break;
				}
			}
			
		}
		
	}

}
