package baejoon.math.baejoon10953;

import java.util.Scanner;
/*
 * 문자열 변수.split("구분할 문자);
 * 문자열 변수.split("구분할 문자",구분될 갯수)
 * split() 함수는 문자를 통해 문자열을 쪼개고 배열로 돌려준다
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++) {
			String[] str = sc.nextLine().split(",");
			System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
		}
	}

}
