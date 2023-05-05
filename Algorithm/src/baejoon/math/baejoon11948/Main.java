package baejoon.math.baejoon11948;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a[] = new int[4];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int e = sc.nextInt();
		int f = sc.nextInt();
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=1;i--) {
			sum+=a[i];
		}
		if(e>f) {
			sum+=e;
		}else {
			sum+=f;
		}
		
		System.out.println(sum);
		sc.close();
		
	}

}
