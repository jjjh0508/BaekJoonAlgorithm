package baekjoon.string.baekjoon11721;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		StringBuilder builder = new StringBuilder();
		
		for(int i =0 ;i<string.length();i++) {
			builder.append(string.charAt(i));
			if((i+1)%10==0){
				builder.append("\n");
			}
		}
		
		System.out.println(builder);

	}

}
