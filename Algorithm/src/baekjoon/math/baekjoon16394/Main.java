package baekjoon.math.baekjoon16394;

import java.util.Scanner;

/*홍익대학교는 1946년에 개교하였다.

	특정 년도가 주어졌을 때, 그 해가 개교 몇 주년인지 출력하라.

	단, 홍익대학교는 없어지지 않는다고 가정한다.
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int var =  year-1946;
		System.out.println(var);
	}

}
