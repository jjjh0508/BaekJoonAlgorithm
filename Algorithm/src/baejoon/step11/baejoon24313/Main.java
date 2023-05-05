package baejoon.step11.baejoon24313;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		if((a*n+b<= c*n)&&(c>=a)){
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
