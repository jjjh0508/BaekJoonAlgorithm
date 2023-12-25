package baekjoon.implementation.baekjoon15813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[] string = new char[n];
		int sum = 0 ;
		string = br.readLine().toCharArray();
		
		for(int i = 0 ; i< n ; i++) {
			sum += string[i]-64;
		}
		
		System.out.println(sum);
	}

}
