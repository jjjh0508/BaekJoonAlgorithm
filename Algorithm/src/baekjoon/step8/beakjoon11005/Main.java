package baekjoon.step8.beakjoon11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;





public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int b = Integer.parseInt(st.nextToken());
		
		
		List<Character> charList = new ArrayList<>();
		
		while (n>0) {
			if(n%b < 10) {
				charList.add((char)(n%b+'0'));
			}else {
				charList.add((char)(n%b+55));
		
			}
			n /= b;
		}
		
		for(int i= charList.size()-1 ;i>=0; i--) {
			System.out.print(charList.get(i));
		}
	}

}
