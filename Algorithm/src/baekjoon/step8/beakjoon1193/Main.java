package baekjoon.step8.beakjoon1193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 1;
		
		while(count<num) {
			num -= count;
			count++;
		}
		if(count % 2==0) {
			System.out.println(num+"/"+(count-num+1));
		}else {
			System.out.println((count-num+1)+"/"+num);
		}
	}

}
