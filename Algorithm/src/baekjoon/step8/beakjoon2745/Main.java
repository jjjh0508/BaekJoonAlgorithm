package baekjoon.step8.beakjoon2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String n = st.nextToken();
		String b = st.nextToken();
		Long bnum = Long.parseLong(b);
		Long sum = 0L ;
		int j =0;
		for(int i = n.length()-1 ; i>=0;i--) {
			
			int nnum=0;
			if(n.charAt(i)<= 58) {
				nnum = n.charAt(i)-48;
			}else {
				nnum = n.charAt(i)-55;
			}
			sum += (long) (nnum*(Math.pow(bnum, j)));
			j++;
		
		
		}
		
		System.out.println(sum);
	}

}
