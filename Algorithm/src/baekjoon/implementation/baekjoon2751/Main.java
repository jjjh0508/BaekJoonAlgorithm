package baekjoon.implementation.baekjoon2751;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder  sb = new StringBuilder();
		int n = sc.nextInt();
		List<Integer> num = new ArrayList<Integer>();
		for(int i= 0 ; i<n;i++) {
			num.add(sc.nextInt());
		}
		Collections.sort(num);
		
		for(int i = 0 ; i < n ; i++) {
			sb.append(num.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}

}
