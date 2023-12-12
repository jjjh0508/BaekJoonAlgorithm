package baekjoon.implementation.baekjoon1357;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Rev(sc.nextInt());
		int y = Rev(sc.nextInt());
		
		
		
		System.out.println(Rev(x+y));
		

	}

	public static int Rev(int num) {
		String str="";
		
		while (num>0) {
			str += num%10;
			num/=10;
			
		}
		
		return(Integer.parseInt(str));
	}
}


