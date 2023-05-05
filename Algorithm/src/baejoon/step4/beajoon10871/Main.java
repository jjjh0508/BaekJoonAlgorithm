package baejoon.step4.beajoon10871;

import java.util.Scanner;

public class Main {
/*
 * 정수 n개로 이루어진 수열
 * x 보다 작은 수를 모두 출력하는 프로그램
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[sc.nextInt()];
		int x = sc.nextInt();
		
		for(int i =0; i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0;i<n.length;i++) {
			if(n[i]<x) {
				System.out.print(n[i]+" ");
			}
		}
		
		sc.close();
	}

}