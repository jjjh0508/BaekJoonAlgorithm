package baejoon;

import java.util.Scanner;

public class BaeJoon2556 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [9][9];  // 9 9 2차원 정변 배열 선언
		int max = -1; //  최대값 저장할 변수
		int x=0;	// 좌표값
		int y=0;	// 좌표값
		for(int i=0;i<arr.length;i++) {			//배열에 값저장
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max= arr[i][j];  // 배열의 값을 하나씩 꺼내서 최대값과 비교하고 배열값이 크면 저장
					x=i+1;			//현재 위치 저장 문제에서는 1행부터인데  인덱스가 0부터 이기 때문에 +1
					y=j+1;			// 현재 위치를 저장 1열부터인데 인덱스가 0부터라 +1
				}
			}
		}
		System.out.println(max);
		System.out.println(x+" "+y);
		
		
	}

}
