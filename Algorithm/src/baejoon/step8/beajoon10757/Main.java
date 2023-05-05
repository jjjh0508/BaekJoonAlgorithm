package baejoon.step8.beajoon10757;
/* BigInteger
 * BigInteger a = new BigInteger("문자열");
 * 문자열로 받는다.
 * BigInteger a = sc.nextBigInteger();
 * 스캐너로 받기 
 * BigInteger a = BigInteger.valueOf(val);
 * BigInteger c = a.add(b); a
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		sc.close();
		BigInteger c = a.add(b);
		
		System.out.println(c);
		
	}

}
