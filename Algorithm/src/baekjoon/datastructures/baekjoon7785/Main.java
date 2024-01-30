package baekjoon.datastructures.baekjoon7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> hashSet = new HashSet<String>();
		StringBuilder sb  = new StringBuilder();
		for(int i = 0; i< n ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String commute = st.nextToken();
			if(commute.equals("enter")) {
				hashSet.add(name);
			}else if(commute.equals("leave")) {
				hashSet.remove(name);
			}
			
		
			
		}
		ArrayList<String> names = new ArrayList<String>(hashSet);
		Collections.sort(names,Collections.reverseOrder());
		for(int i = 0 ; i< names.size();i++) {
			sb.append(names.get(i)).append("\n");
		}
		
		System.out.println(sb);

	}

}
