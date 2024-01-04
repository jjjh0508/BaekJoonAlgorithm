package baekjoon.sorting.beakjoon10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Set<Integer> integers = new HashSet<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			integers.add(Integer.parseInt(st.nextToken()));
		}
		List<Integer> arr = new ArrayList<Integer>(integers);
		Collections.sort(arr);
		
		for(int i = 0 ; i < arr.size(); i++) {
			sb.append(arr.get(i)+" ");
		}
		
		System.out.println(sb);
	
		

	}

}
