package baekjoon.implementation.baekjoon5800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i= 1 ;i<=n;i++) {
			st=new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int[]num = new int[m];
			for(int j = 0; j<m;j++) {
				 num[j]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num);
			int[] answer = new int[m];
			for(int j=0;j<m-1;j++) {
				answer[j]= num[j+1]-num[j];
			}
			Arrays.sort(answer);
			System.out.println("Class "+i);
			System.out.println("Max "+num[m-1]+", Min "+num[0]+", Largest gap "+answer[m-1]);
			
		}

	}

}
