package baekjoon.implementation.baekjoon1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws IOException {
		String[] num = {"000","001","010","011","100","101","110","111"};
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		
		for(int i = 0 ; i < string.length();i++) {
			int n = string.charAt(i)-'0';
			sb.append(num[n]);
		}
		
		if(string.equals("0")) {
			System.out.println(string);      //0이면 그냥 0을 출력
		}else {
			while (sb.charAt(0)=='0') {      //앞자리가 0이면 그 뒤 자리부터 잘라서 새로 생성
				sb = new StringBuilder(sb.substring(1)); 
				
			}
			System.out.println(sb);
		}
	
		
	}

}
