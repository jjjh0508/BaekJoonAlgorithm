package baejoon.step4.beajoon10807;

import java.util.Scanner;

public class Main {
/*총 n개의 정수가 주어졌을떄 정수 v가 몇개인지 구하는 프로그램
 * 첫번째 줄에 줄의 개수n 두번째 줄엔 정수
 * 섯째줄에 찾으려는 정수v가 주어진다.
 * 
 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cout = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==v) {
				cout++;
			}
		}
		System.out.println(cout);
		sc.close();
	}

}