package baekjoon.sorting.beakjoon1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Set<String> arr = new HashSet<String> ();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i< n ; i++) {
			arr.add(br.readLine());
		}
		String[] arrSrt =  arr.toArray(new String[arr.size()]);
		Arrays.sort(arrSrt,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
					}else {
						return o1.length()-o2.length();
					}
				
			}
		});
		
		for(int i = 0 ; i<arrSrt.length;i++) {
			sb.append(arrSrt[i]).append("\n");
		}
		System.out.println(sb);
		
	}

}
