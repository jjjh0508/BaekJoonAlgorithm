package baekjoon.priorityqueue.baekjoon1927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x==0) {
				if(integers.size()==0) {
					sb.append("0").append("\n");
				}else {
					sb.append(integers.poll()).append("\n");
				}
			}else {
				integers.add(x);
			}
			
		}
		
		System.out.println(sb);

	}

}
