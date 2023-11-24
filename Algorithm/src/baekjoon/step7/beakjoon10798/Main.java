package baekjoon.step7.beakjoon10798;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] ch = new char[5][15];
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<5;i++) {
			ch[i]=sc.next().toCharArray();
		}
		
		for(int i=0; i<15 ; i++) {
			for(int j=0;j<5;j++) {
				if(ch[j].length>i) {
					builder.append(ch[j][i]);
				}
			}
		}
		System.out.println(builder);
	}

}
