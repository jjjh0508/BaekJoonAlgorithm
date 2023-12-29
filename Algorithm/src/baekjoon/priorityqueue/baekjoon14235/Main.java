package baekjoon.priorityqueue.baekjoon14235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> integers = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i< n ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a == 0) {
				if(integers.size()==0) {
					sb.append("-1").append("\n");
				}else {
					sb.append(integers.poll()).append("\n");
				}
			}else {
				for(int j = 0 ; j < a ; j++) {
					integers.add(Integer.parseInt(st.nextToken()));
				}
			}
			
		}
		
		System.out.println(sb);

	}

}
