package baekjoon.step5.beakjoon2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t= sc.nextInt();
		
		for(int i = 0 ; i < t ;i++) {
			StringBuilder builder =  new StringBuilder();
			int r = sc.nextInt();
			String string = sc.next();
			
			for(int j = 0 ; j<string.length() ; j++) {
				for(int k=0; k<r;k++) {
					builder.append(string.charAt(j));
				}
			}
			System.out.println(builder);
		}
	
		
	}

}
