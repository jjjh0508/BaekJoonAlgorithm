package baekjoon.string.baekjoon1427;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		char[] ch = string.toCharArray();
		
		
		Arrays.sort(ch);
		
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
