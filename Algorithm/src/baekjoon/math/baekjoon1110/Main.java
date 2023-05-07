package baekjoon.math.baekjoon1110;
/*
 * 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고,
 *주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다
 *26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다.
 * 새로운 수는 26이다.위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 * 일의 자리 num %10
 * 십의 자리 num/10
 * 변수 a에 십의 자리
 * 변수 b에 일의 자리
 * 비교할 변수 num1= b*10((a+b))%10
 * b*10 1의 자리를 십의 자리로 (a+b)&10 a+b 가 10의 자리 일 경우 일의 자리만 구하기 위헤
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num<10) {
			num*=10;
		}
		int a=num/10;
		int b=num%10;
		int ctn=0;
		int num1 = b*10+((a+b)%10);
		ctn++;
		while(num!=num1) {
			
			
			a=num1/10;
			b=num1%10;
			num1 = b*10+((a+b)%10);
			ctn++;
		}
		
		System.out.println(ctn);
				
		
		}
	}


