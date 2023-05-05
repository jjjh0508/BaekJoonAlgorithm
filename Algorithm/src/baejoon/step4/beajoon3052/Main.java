package baejoon.step4.beajoon3052;

import java.util.Scanner;

/* 정수 10개를 입력 받은 뒤 42로  나눈 나머지를 구하고
 * 서로 다른 값이 몇개인지 구해라
 *  배열에 42나눈 나머지를 넣고
 *  비교를 ?? 하는법
 *  나올 수 있는 나머지가 0~41이르면 42인 boolean 배열을 선언
 *  hashSet<Integer> h = new HashSet<Integer>();
 *  Aarrys.sort(배열); 크기순으로 정렬
 *  for(int a=0;a<배열.length-1;a++){
 *  	if(배열[a] != 배열[a+1]) count++
 *  }
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] bo = new boolean[42];
		int count = 0;
		for(int i=0;i<10;i++) {
			bo[sc.nextInt()%42]=true;
		}
		sc.close();
		for(int i=0;i<bo.length;i++) {
			if(bo[i]==true) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}

}
