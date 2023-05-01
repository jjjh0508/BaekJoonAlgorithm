package baejoon;
/*
 * 0000*
 * 000***
 * 00*****
 * 0*******
 * *********
 * 0*******0
 * 00*****00
 * 
 * 
 */
import java.util.Scanner;

public class BaeJoon2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++) {   // i가 0에서  n-1까지 증가
			for(int j=i; j<n-1;j++) { // j=i j<n-1까지 증가
				System.out.print(" ");
			}
		// i=0이면 j=0 j는 n<(5-1)까지  " " 출력
		for(int j=0;j<(i*2+1);j++) { //j=0 j< i*2+1)까지 j증가 , i가 0이면 j는 1까지 증가  "*"출력
			// 0000*
			System.out.print("*"); 
		}
		System.out.println();
		
		}
		// 줄어드는 구간 
		for(int i=0;i<n;i++) {			//i가 0  i<n(5) i증가
			for(int j=0; j<i;j++) {		//j가0  j<i  j증가
				System.out.print(" "); //i가 0이면 j<0 이니 실행안함 i가 1이면 " " 한번 2면 " " " "
			}
		for(int j=i*2;j<(n*2-1);j++) { //j=i*2 j<n(5)*2-1 j++
			System.out.print("*"); // i가 0아면 j=0이고 9까지 증가
		}							//i가 1 증가할때마다 2씩 증가하고 9까지 증가 별이 두개씩 줄어듬
		System.out.println();
		
		}
	}

}
