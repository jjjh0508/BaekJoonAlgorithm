package baejoon.math.baejoon2440;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int y=n;y>i;y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
