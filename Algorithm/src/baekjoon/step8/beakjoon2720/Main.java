package baekjoon.step8.beakjoon2720;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		
		int caseNum = scanner.nextInt();
		
		
		for(int i = 0; i<caseNum ; i++) {
			int money = scanner.nextInt();
	
			int q  = 0;
			int d = 0;
			int n = 0;
			int p = 0;
		
			q = money / 25;
			money = money % 25;
		
			d = money / 10;
			money = money % 10;
		
			n = money / 5;
			money = money % 5;
	
			p = money / 1;
			money = money % 1;
			
			System.out.println(q+ " "+d+" "+ n+ " "+p);
		}

	}
}
