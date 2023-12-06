package baekjoon.implementation.baekjoon8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//회 n를 입력받는다
		//OXOX를 입력 받는다.
		//O가 나오면 count를 올리고 sum에 더해주고 x가 나오면 0으로 바꿔서 추가해준다
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			int count = 0;
			int sum = 0;
			String string = sc.nextLine();
			for(int j=0;j<string.length();j++) {
				char ch = string.charAt(j);
				if(ch=='O') {
					count++;
					sum+=count;
					
				}else {
					count = 0;
					
				}
				
			}
			System.out.println(sum);
		}
	}

}
