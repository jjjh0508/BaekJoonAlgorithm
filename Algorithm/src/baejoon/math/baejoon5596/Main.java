package baejoon.math.baejoon5596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[4];
		int[] b=  new int[4];
		int s=0;
		int t=0;
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			s+=a[i];
		}
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
			t+=b[i];
		}
		if(s>=t) {
			System.out.println(s);
		}else {
			System.out.println(t);
		}
	}

}
