package baekjoon.datastructures.baekjoon28279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> deque = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i = 0 ; i<n;i++) {
			st= new StringTokenizer(br.readLine());
			int key = Integer.parseInt(st.nextToken());
			switch (key) {
			case 1:
				int firstNum = Integer.parseInt(st.nextToken());
				deque.addFirst(firstNum);
				break;
			case 2:
				int lastNum = Integer.parseInt(st.nextToken());
				deque.addLast(lastNum);
				break;
			case 3:
				if(deque.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(deque.pollFirst()).append("\n");
				}
				break;
			case 4:
				if(deque.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(deque.pollLast()).append("\n");
				}
				break;
			case 5:
				sb.append(deque.size()).append("\n");
				break;
			case 6:
				if(deque.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
				break;
			case 7:
				if(deque.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(deque.peekFirst()).append("\n");
				}
				break;
			case 8:
				if(deque.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(deque.peekLast()).append("\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb);

	}

}
