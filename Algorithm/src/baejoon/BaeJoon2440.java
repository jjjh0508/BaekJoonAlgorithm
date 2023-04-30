package baejoon;

import java.util.Scanner;

public class BaeJoon2440 {

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
