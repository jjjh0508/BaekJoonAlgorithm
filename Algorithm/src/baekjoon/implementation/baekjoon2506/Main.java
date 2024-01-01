package baekjoon.implementation.baekjoon2506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] score = new int[n];
		int count = 0;
		int sum = 0;
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			score[i]= Integer.parseInt(st.nextToken());
	   }
	   
	   for(int i = 0 ; i < n ; i++) {
		   if(score[i]==1) {
			   count++;
			   sum+=count;
		   }else {
			   count=0;
		   }
	   }
	   System.out.println(sum);
	}

}
