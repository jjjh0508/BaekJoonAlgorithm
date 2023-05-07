package baekjoon.step12.baekjoon2839;

import java.util.Scanner;


/* n킬로그램을 배달해야한다
 * 봉투의 규격은 5키로 3키로
 * 18키로를 입력해주면 5키로 3개 3키로 한개  9는 3  6은 2 11은 3 4는 -1
 * 정확히 n개를 할 수 없으면 -1개를 출력
 * 4랑 7은 나눌수 없다
 * 
 * n%5==0 n/5
 * n%5==1 이거나 3 이면 +1
 * 11킬로 - 5킬로 1개 +3킬로 2개 = 3
 * 5킬로 2개 나머지 1  +1 해주면 3개
 * 
 * n%5==2 거나 4일땐 +2
 * 12킬로  5 0개  3킬로 4개
 *  5킬로 두개 나머지 2  +2해주면 4개
 *   
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
	if(num==4||num==7) {
		System.out.println(-1);
	}else if(num%5==0) {
		System.out.println(num/5);
	}else if(num%5==1 || num%5==3) {
		System.out.println(num/5+1);
	}else if(num%5==2||num%5==4) {
		System.out.println(num/5+2);
	}
		
		
	}
}