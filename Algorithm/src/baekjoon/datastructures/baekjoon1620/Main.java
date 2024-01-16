package baekjoon.datastructures.baekjoon1620;


import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
		for(int i = 1; i<=a; i++) {
			String poname = sc.next();
			hashMap.put(i, poname);
			hashMap2.put(poname, i);
		}
		for(int i= 0 ; i < b ; i++) {
			
			if(sc.hasNextInt()) {
				sb.append((hashMap.get(sc.nextInt()))).append("\n");
			}else {
				String name = sc.next();
				sb.append(hashMap2.get(name)).append("\n");
			}
		}
		sc.close();
		System.out.println(sb);

	}

}
