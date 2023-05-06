package baejoon.string.baekjoon25206;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String [] grader = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"}; // 등급 배열
		double[] rating = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};  // 과목평점 배열
		double sum=0;
		double avg=0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<20;i++) {
			
			String[] str = sc.nextLine().split(" ");  //문자열을 받아오면서  " " 를 기준으로 저장
			if(!str[2].equals("P")) { //P가 아닐 경우 실행
			int count = Arrays.binarySearch(grader, str[2]); // grager에 str[2]랑 같은게 어느 위치에 있는지 반환
			sum+=Double.parseDouble(str[1]);  // str[1]에는  학점이 Strig으로 저장되어있어서 double로 바꿔서 저장
			avg+=Double.parseDouble(str[1])*rating[count]; // 학점과 과목평가를 곱해서 저장
			}
		}
		sc.close();
		System.out.printf("%.6f",avg/sum); // 소수점 6자리까지 표기
	}

}
