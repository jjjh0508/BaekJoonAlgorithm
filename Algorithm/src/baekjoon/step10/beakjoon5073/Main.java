package baekjoon.step10.beakjoon5073;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int[] num= new int[3];
			int max = 0 ; 
			int count =0;
			int sum=0;
			for(int i=0;i<3 ;i++) {
				num[i]=sc.nextInt();
			}
			if(num[0]==0 && num[1]==0 && num[2]==0) {
				break;
			}
			for(int i=0;i<3 ;i++) {
				for(int j=0;j<3;j++) {
					if(num[i]>num[j]&& num[i]>max) {
						max=num[i];
						count = i;
					}
				}
			}
			
			for(int i=0;i<3 ;i++) {
				if(i!=count) {
					sum+=num[i];
				}
			}
		
//			 else if(a >= b+c || b >= c + a || c >= a + b){
			if(max>=sum) { // 큰 값이 합보다 커야한다
				System.out.println("Invalid");
			}else if(num[0]==num[1] && num[1]==num[2]) { // 3변의 길이가 모두 같아야한다
				System.out.println("Equilateral");
				
			}else if(num[0]!=num[1] && num[1]!=num[2] && num[0]!=num[2]){ // 세변의 길이가 모두 달라야한다
				System.out.println("Scalene");
			}else if(num[0]== num[1] || num[1]==num[2]||num[0]==num[2]){ //  두변의 길이만 같은 경우 
				System.out.println("Isosceles");
			}
		}

	}

}
