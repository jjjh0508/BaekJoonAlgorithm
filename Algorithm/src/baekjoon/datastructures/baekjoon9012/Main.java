package baekjoon.datastructures.baekjoon9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i <n ; i++) {
			Stack<Character> stack = new Stack<Character>();
			boolean flag = true;
			String vps = br.readLine();
			
			for(int j = 0 ; j<vps.length();j++) {
				if(vps.charAt(j)=='(') {    // (이면 스택에 저장
					stack.push(vps.charAt(j));
				}else {
					if(stack.isEmpty()) {         // (가 아니면 스택이 비어있는지 확인후 비어있으면 false로 변경 
						flag=false;
					}else {
						stack.pop();              //비어 있지 않으면 (가 들어있으니 제거
					}
				}
				
			}
	
			if(!stack.isEmpty()) {
				flag = false;
			}
			if(flag) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
			
		}
		System.out.println(sb);
	}

}
