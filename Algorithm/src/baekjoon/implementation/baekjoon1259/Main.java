package baekjoon.implementation.baekjoon1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String num = br.readLine();
			if(num.equals("0")) {
				return;
			}
			int count = num.length()-1;
			for(int i = 0 ;i<num.length();i++) {
				char ci = num.charAt(i);
				char cj = num.charAt(count);
				if(ci!=cj) {
					System.out.println("no");
					break;
				}
				count--;
			}
			if(count==-1) {
				System.out.println("yes");
			}
		}

	}

}
