package baekjoon.string.baekjoon1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		char[] sting = br.readLine().toCharArray();
		
		for(int i = 0 ; i < n-1; i++) { // n-1 이유 위에서 하나 먼저 입력 받았다.
			char[] sting2 = br.readLine().toCharArray();
			for(int j = 0 ; j <sting.length;j++) {
				if(sting[j]!=sting2[j]) {
					sting[j]='?';
				}
				
			}
			
			
		}
		
		System.out.println(sting);
	}

}
