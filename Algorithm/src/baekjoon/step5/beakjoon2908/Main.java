package baekjoon.step5.beakjoon2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		
		StringBuilder c = new StringBuilder();
		StringBuilder d = new StringBuilder();
		for(int i =a.length();i>0;i--) {
			c.append(a.charAt(i-1));
			d.append(b.charAt(i-1));
		}
		int ac = Integer.parseInt(c.toString());
		int db = Integer.parseInt(d.toString());
		if(ac > db) {
			System.out.println(ac);
		}else {
			System.out.println(db);
		}
	}
}
