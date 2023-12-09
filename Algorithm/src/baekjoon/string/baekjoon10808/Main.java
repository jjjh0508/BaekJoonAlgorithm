package baekjoon.string.baekjoon10808;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		int[] alphabet = new int[26];
		char ch = 'a';
		for(int i = 0 ; i< 26;i++) {
			
			for(int j = 0 ; j<string.length();j++) {
				if(ch==string.charAt(j)) {
					alphabet[i]+=1;
				}
			}
			ch++;
		}
		for(int i= 0 ; i<alphabet.length;i++) {
			System.out.print(alphabet[i]+" ");
		}
	}

}
