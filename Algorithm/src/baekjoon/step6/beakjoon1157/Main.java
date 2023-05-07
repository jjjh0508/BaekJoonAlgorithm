package baekjoon.step6.beakjoon1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int count=0;
		
		str = str.toUpperCase();
		char[] carr = str.toCharArray();
		int[] iarr = new int[26]; // 대문자 알파벳 수
		/* 아스키코드 대문자 알파벳 A:65 Z:90*/
		for(int i=0;i<carr.length;i++) {
			int z =0; // 알파벳 사용회수를 저장하고 0으로  초기화 하기 위해 밖 for 안쪽에 선언
			for(char j='A';j<='Z';j++,z++) {  //char로도 for 사용가능
				if(carr[i]==j) {
					iarr[z]++;
					break;
				}
			}
		}
		int[] copy  = Arrays.copyOf(iarr, iarr.length);
		char alpha=' ';
		Arrays.sort(copy);
		for(int i=0;i<iarr.length;i++) {
			if(iarr[i]==copy[copy.length-1]) { // 정렬해서 최대값을 원래 배열과 비교\
				alpha = (char) (i+65); // 알파벳 저장
				count++;
				
			}
		}
		if(count>=2) {
			System.out.println("?");
		}else {
			System.out.println(alpha);
		}
		
	}
}
