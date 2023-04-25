package baejoon;

import java.util.Scanner;

/*
 * 전체의 22퍼와 80퍼의 22퍼 구하기
 */
public class BaeJoon20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = (int) (a-(a*0.22));
		int c= (int) (a-(a-(a*0.8))*0.22);
		System.out.println(b+" "+c);
		
	}

}
