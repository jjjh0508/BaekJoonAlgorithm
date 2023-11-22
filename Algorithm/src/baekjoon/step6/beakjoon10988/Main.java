package baekjoon.step6.beakjoon10988;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		int count = string.length()-1;
		for(int i=0;i<string.length();i++) {
			char ci = string.charAt(i);
			char cj = string.charAt(count);
			
			if(ci!=cj) {
				System.out.println(0);
				break;
			}
			count--;
		}
		if(count==-1) {
			System.out.println(1);
		}
	
	}

}
