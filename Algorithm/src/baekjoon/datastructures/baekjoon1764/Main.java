package baekjoon.datastructures.baekjoon1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n =  Integer.parseInt(st.nextToken());
		int m =  Integer.parseInt(st.nextToken());
		HashSet<String> set = new HashSet<String>();
		List<String> names = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < n ; i++ ) {
			set.add(br.readLine());
		}
		
		for(int i = 0 ; i < m ; i++) {
			String name = br.readLine();
			if(set.contains(name)) {
				names.add(name);
			}
		}
		sb.append(names.size()).append("\n");
		Collections.sort(names);
		for(int i = 0 ; i< names.size();i++) {
			sb.append(names.get(i)).append("\n");
		}
		
		System.out.println(sb);

	}

}
