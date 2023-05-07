package baekjoon.step3.beakjoon15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		OutputStreamWriter ow = new OutputStreamWriter(System.out);
		BufferedReader br = new BufferedReader(is);
		BufferedWriter bw = new BufferedWriter(ow);
		
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i=1;i<=t;i++) {	
			StringTokenizer st = new StringTokenizer(br.readLine()+" ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
			
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}
}
