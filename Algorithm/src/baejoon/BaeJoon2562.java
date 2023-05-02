package baejoon;

import java.util.Scanner;

public class BaeJoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int max=0;
		int cnt=1;
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
			if(max<n[i]) {
				max=n[i];
				cnt=i+1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
		sc.close();
	}

}
