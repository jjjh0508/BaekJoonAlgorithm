package baekjoon.math.baekjoon5534;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 버거 3개랑 음료두개 세트중 제일 싼 세트
 * 버거는 총 3종류 음료는 두종류
 * 세트는 - 50원
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] burger = new int[3];
		int[] cola = new int[2];
		int[] set = new int[6];
		int count=0;
		for(int i=0;i<burger.length;i++) {
			burger[i]=sc.nextInt();
		}
		for(int i=0;i<cola.length;i++) {
			cola[i]=sc.nextInt();
		}
		for(int i=0;i<burger.length;i++) {
			for(int j=0;j<cola.length;j++) {
				set[count]=(burger[i]+cola[j])-50;
				count++;
			}
		}
		Arrays.sort(set);
		System.out.println(set[0]);
		
		
	}

}
