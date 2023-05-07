package baekjoon.step4.beakjoon10818;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int [] array;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array = new int[n];
		int max = -1000000;
		int min =  1000000;
		for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();
			
		}
		for (int j:array){
			max= Math.max(j, max);
		}
		for(int j:array) {
			min = Math.min(j, min);
		}
		System.out.println(min+" "+max);
		sc.close();
	}

}
