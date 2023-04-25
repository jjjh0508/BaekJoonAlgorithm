package baejoon;

import java.util.Scanner;

/*
 * 5명의 평균 구하기
 * 40점 미만은 40점으로 바꾸기
 * 정수로 선언하기
 */
public class BaeJoon10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			int num = sc.nextInt();
			if(num<40) {
				num=40;
			}
			arr[i]=num;
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum/5);
	}

}
