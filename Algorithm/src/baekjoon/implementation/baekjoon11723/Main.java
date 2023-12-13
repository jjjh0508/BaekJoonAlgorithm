package baekjoon.implementation.baekjoon11723;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Integer> S = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			String str = sc.next();
			switch(str) {
				case  "add":
					S.add(sc.nextInt());
					break;
				case "remove":
					S.remove(sc.nextInt());
					break;
				case "check" :
					if(S.contains(sc.nextInt())) {
						sb.append("1").append("\n");
					}else {
						sb.append("0").append("\n");
					}
					break;
				case "toggle":
					int num = sc.nextInt();
					if(S.contains(num)) {
						S.remove(num);
					}else {
						S.add(num);
					}
					break;
				case "all" :
					for(int j=1;j<21;j++) {
						S.add(j);
					}
					break;
				case "empty":
					S.clear();
					break;
						
			}
		}
		
		System.out.println(sb);
		
	}

}
