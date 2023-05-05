package baejoon.math.baejoon5522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[] card = new byte[5];
		int sum=0;
		for(int i=0;i<card.length;i++) {
			byte bnum = sc.nextByte();
			if(bnum>=0&&bnum<=100) {
				card[i]=bnum;
			}
			
		}
		for(int i=0;i<card.length;i++) {
			sum+=card[i];
		}
		System.out.println(sum);
	}

}
