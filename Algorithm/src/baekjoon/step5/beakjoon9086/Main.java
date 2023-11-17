package baekjoon.step5.beakjoon9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i <t ;i++) {
			String string = sc.nextLine();
			System.out.println(string.charAt(0)+""+string.charAt(string.length()-1));
			
		}
		

	}

}
