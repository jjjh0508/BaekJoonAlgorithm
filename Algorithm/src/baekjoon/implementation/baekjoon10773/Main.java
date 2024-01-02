package baekjoon.implementation.baekjoon10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		Stack<Integer> integers = new Stack<Integer>();
		for(int i = 0 ; i < n ; i++) {
			int k = Integer.parseInt(br.readLine());
			if(k!=0) {
				integers.add(k);
				sum+=k;
			}else {
				sum-=integers.pop();
			}
		}
		System.out.println(sum);

	}

}
