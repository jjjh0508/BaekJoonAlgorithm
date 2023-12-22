package baekjoon.implementation.baekjoon1417;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int my = Integer.parseInt(br.readLine()); // 내 표는 큐에 넣지 않고 따로 저장
		int count = 0;                            // 매수해야 하는 수
		if(n!=1) {                                // n이 1인 경우 실행 할 필요가 없다.
			for(int i=0;i<n-1;i++) {
				pq.add(Integer.parseInt(br.readLine()));
			}
		
			while (my<=pq.peek()) {              //큐에 있는 수가 내 표보다 큰 경우에  반복
				int num = pq.poll();             //젤 큰 수를 꺼내고
				num--;                           
				my++;
				count++;
				pq.add(num);
			}
		}
		System.out.println(count);
	}

}
