package baekjoon.step10.beakjoon14215;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max =0;
		if(a>b) {   // a가 큰 경우
			if(b>c) { // b가 c보다 크면 a가 제일 크다
				max=a;
			}else { // c가 더 크면 a>c로 a와 c 크기 비교
				max= (a>c) ? a: c;
			}
		}else { //b가 더 크다면 
			max = (b>c) ? b : c;
		}
		
		if(a+b+c-max>max) {   // a+b+c -max가 max보다 크면  a+b+c 출력
			System.out.println(a+b+c); 
		}else {
			System.out.println((a+b+c-max)*2-1); //max가 더 크면 (a+b+c-max)*2 -1 출력
		}
	}

}
