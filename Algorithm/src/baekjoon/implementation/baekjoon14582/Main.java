package baekjoon.implementation.baekjoon14582;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] zeminu = new int[9];
		int[] star = new int[9];
		int zeminuSum = 0;
		int starSum = 0; 
		int count = 0;
		
		for(int i = 0 ; i< zeminu.length;i++) {
			zeminu[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i< star.length;i++) {
			star[i]=Integer.parseInt(st.nextToken());
		}
		for(int i = 0 ; i< star.length;i++) {
			zeminuSum+=zeminu[i];
			if(zeminuSum>starSum) {
				System.out.println("Yes");
				return;
			}
			
			starSum+= star[i];
			
		}
		System.out.println("No");


	}

}
