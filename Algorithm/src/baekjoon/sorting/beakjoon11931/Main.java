package baekjoon.sorting.beakjoon11931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr,Collections.reverseOrder());
		for(int i = 0 ;i < n ; i++) {
			sb.append(arr.get(i)).append("\n");
		}
		
		System.out.println(sb);

	}

}
