package baejoon.math.baejoon2338;
/*
 * 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A×B를 출력한다. 각각을 출력할 때, 
 * 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는 의미)
 * 1000자리를 넘지 않으면 양수 음수 다 줄 수있다
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		
	}

}
