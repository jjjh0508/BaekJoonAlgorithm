package baekjoon.step5.beakjoon10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] count = new int[26];
		Arrays.fill(count, -1);
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		for(int i = 0 ; i < 26; i++) {
			char ch = (char)(97+i);
			for(int j = 0 ; j < s.length();j++) {
				char ap = s.charAt(j);
				if(ap==ch && count[i]==-1) {
					count[i]=j;
				}
			}
		}
		
		for(int i = 0 ; i< count.length;i++) {
			System.out.print(count[i]+" ");
		}
	}

}
