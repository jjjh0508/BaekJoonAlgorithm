package baekjoon.step8.beakjoon2869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//낮에 a 만큼 오른다
		int b = sc.nextInt();
		//밤에 b만큼 내려온다
		int v = sc.nextInt();
		// 정상까지 올라가야한다
		
		int count = (v-b)/(a-b); 
		
		// 5 1 6 같은 나머지가 있는 식이 있다 그럴경우 +1해준다;
		if((v-b)%(a-b)!=0) {
			count++;
		}
		
		System.out.println(count);
		
	}

}
