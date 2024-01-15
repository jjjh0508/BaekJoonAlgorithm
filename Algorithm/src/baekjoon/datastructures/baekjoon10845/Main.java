package baekjoon.datastructures.baekjoon10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		StringTokenizer st ;
		StringBuilder sb = new StringBuilder();
		int last = 0 ;
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(br.readLine());
			String com = st.nextToken();
			switch (com) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				queue.add(num);
				last = num;
				break;
			case "pop" : 
				if(queue.size()==0) {
					sb.append("-1").append("\n");
				}else {
					sb.append(queue.poll()).append("\n");
					
				}
				break;
			case "size":
				sb.append(queue.size()).append("\n");
				break;
			case "empty":
				if(queue.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				if(queue.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(queue.peek()).append("\n");
				}
				break;
			case "back":
				if(queue.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(last).append("\n");
				}
				break;
				
				
			default:
				break;
			}
		}
		System.out.println(sb);

	}

}
