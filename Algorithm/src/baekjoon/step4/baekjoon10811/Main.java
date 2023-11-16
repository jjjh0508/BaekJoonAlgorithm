package baekjoon.step4.baekjoon10811;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] basket = new int[n];
		
		for(int i = 1; i<= n ; i++){
			basket[i-1] = i;
			
		}
		
		for(int i = 0 ; i<m;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int k = y-1;
			for(int j=x-1 ;j<y ; j++) {
				if((j)<(k)) {
					int temp = basket[j];
					basket[j] = basket[k];
					basket[k] = temp;
					k--;
				}
				
				
			}
			
		}
		
		for(int i = 0 ; i<n;i++) {
			System.out.print(basket[i]+ " ");
		}
		
	}

}
