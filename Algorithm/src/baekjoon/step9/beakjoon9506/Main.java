package baekjoon.step9.beakjoon9506;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n==-1) {
				break;
			}
			int sub[] = new int[n];
			int count = 0;
			int sum=0;
			
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sub[count++]=i;
					sum+=i;
				}
			}
			if(sum!=n) {
				System.out.println(n+" is NOT perfect.");
				continue;
			}
			
			System.out.print(n+ " = ");
			for(int i=0 ;i<count;i++) {
				if(i==count-1) {
					System.out.print(sub[i]);
				}else {
					System.out.print(sub[i]+" + ");
					
				}
			}
			System.out.println();
		
		}
	}
	
	
//	public class Main {
//
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			while (true) {
//				int n = sc.nextInt();
//				if(n==-1) {
//					break;
//				}
//				int sub[] = new int[n];
//				int count = 0;
//				
//				for(int i=1;i<=n;i++) {
//					int x = n%i;
//					if(x==0) {
//						sub[i-1]=i;
//					}
//				}
//				StringBuilder builder = new StringBuilder();
//				builder.append(n+" = ");
//				for(int i=0;i<n;i++) {
//					if(i==0){
//						count += sub[i];
//						builder.append(i+1);
//					}
//					if(sub[i]>0 && i!=0) {
//						if(i!=n-1) {
//							count += sub[i];
//							builder.append(" + "+sub[i]);
//						}
//						
//					}
//					
//				}
//				
//				if(n==count) {
//					System.out.println(builder);
//				}else {
//					System.out.println(n+ " is NOT perfect.");
//				}
//				
//			}
//			
//			
//
//		}
//
//	}
	
	
	

}
