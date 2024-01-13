package baekjoon.math.baekjoon27433;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long factorial = 1;
		
		if( n != 0) {
			for(int i = n ; i>0 ; i-- ) {
				factorial*=i;
			}
			System.out.println(factorial);
		}else {
			System.out.println(factorial);
		}
	}

}
