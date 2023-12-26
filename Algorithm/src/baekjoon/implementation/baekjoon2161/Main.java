package baekjoon.implementation.baekjoon2161;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> num = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i<=n ; i++) {
			num.add(i);
		}
		 
		for(int i = 1 ; i<=n ; i++ ) {
			sb.append(num.poll()).append(" ");
			num.add(num.poll());
		}
		
		System.out.println(sb);
		
		

	}

}
