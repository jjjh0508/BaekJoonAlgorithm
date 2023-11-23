package baekjoon.step6.beakjoon1316;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int score = 0;
		
		sc.nextLine();
		
		String[] string = new String[count];
		
		for(int i=0; i<count; i++) {
			string[i]= sc.nextLine();
		}
		
		for(int i=0; i<count;i++) {
			String word = string[i];
			int[]alphabet = new int[26]; 	//97;
		words: for(int j = 0 ; j< word.length();j++) {
				int cha = word.charAt(j)-97;
				if(alphabet[cha]==1 && word.length()>j-1 && word.charAt(j)!=word.charAt(j-1)) {
					 break words;
				}
				alphabet[cha]=1;
			
				if(j==word.length()-1) {
					score+=1;
				}
				
			}
		}
		System.out.println(score);
	}

}
