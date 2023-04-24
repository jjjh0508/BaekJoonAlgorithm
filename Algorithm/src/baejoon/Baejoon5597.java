package baejoon;

import java.util.Scanner;

/*
 * 총 인원 1~ 30명
 * 입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
 * 없는 번호를 찾아서 작은 거 부터 출력 2명
 * 1~30이니까 31개를 선언하고
 * 28번 돌면서 해당하는 인덱스에 1로 초기화
 * for(int i=0;i<28;i++){
 * int n = sc.nextint();
 * m[n]=1;
 */
public class Baejoon5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] m = new int[31];
		
		for(int i=0;i<28;i++) {
			int n = sc.nextInt();
			m[n]=1;
					
		}
		for(int i =1 ;i<31;i++) {
			if(m[i]!=1) {
				System.out.println(i);
			}
		}
		
	}

}
