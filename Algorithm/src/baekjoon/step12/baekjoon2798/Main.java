package baekjoon.step12.baekjoon2798;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 카드 갯수
		int m = sc.nextInt(); // 블랙잭
		int answer =0; //  답을 저장할 변수
		int sum = 0;  // 카드를 더할 변수
		int[] card = new int[n];
		
		for(int i=0;i<card.length;i++) {
			card[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<card.length;i++) {  // 첫번째 카드
			for(int j=i+1;j<card.length;j++) { // 두번째 카드
				for(int k=j+1;k<card.length;k++) { // 세번째 카드
					sum = card[i]+card[j]+card[k];
					if((sum<=m)&&(sum>=answer)) { //더한카드가 블랙잭보다 작고 더한카드가 답보다 크면 저장
						answer= sum;
					}
					if(answer==m) { // 저장한 값과 블랙이 같으면 탈출
						System.out.println(answer);
						return;
					}
				}
			}
		}
		System.out.println(answer);
		
	}

}
