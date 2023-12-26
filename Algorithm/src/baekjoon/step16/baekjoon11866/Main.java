package baekjoon.step16.baekjoon11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> num = new LinkedList<Integer>();
		
		for(int i = 1 ; i<=n;i++) {
			num.add(i);
		}
		sb.append("<");
		while (num.size()!=1) {
			for(int i =0 ; i<k-1;i++) {
				num.add(num.poll());
			}
			sb.append(num.poll()).append(", ");
		}
		sb.append(num.poll());
		sb.append(">");
		
		System.out.println(sb);
	}

}
