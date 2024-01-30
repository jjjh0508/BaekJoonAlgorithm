package baekjoon.datastructures.baekjoon1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int start = 0;                        //0이 아닌 1을 주고 아래에서  start=num+1 하면 입력수 1,1을 줬을 경우 런타임에러가 발생한다
		for(int i = 0 ; i<n ; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num>start) {
				for(int j = start+1;j<=num;j++) {
					stack.push(j);
					sb.append("+").append("\n");
				}
				
				start=num; // 다음 수를 저장하기 위해
			}
			
			else if(stack.peek()!=num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
			
		}
	
	
			System.out.println(sb);
	

	}

}
