package baejoon;

import java.util.Scanner;

public class Baejoon1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ctn =sc.nextInt();
		double[] score = new double[ctn];
		double[] score2 = new double[ctn];
		double max=0;
		double sum=0;
		double avg =0;
		for(int i =0;i<ctn;i++) {
			score[i] = sc.nextInt();
		}
	
		for(int i=0;i<score.length;i++) { 
			if(max<score[i]) {
				max=score[i];
			}
		}
		for(int i =0;i<score.length;i++) { 
				score2[i] = (score[i]/max)*100;
				
			}			
		
		for(int i=0;i<score2.length;i++) {
			sum+=score2[i];
		}
		avg=sum/ctn;
		System.out.printf("%2.2f",avg);
	}

}
