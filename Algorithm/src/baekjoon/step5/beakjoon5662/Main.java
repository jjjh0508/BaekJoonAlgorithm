package baekjoon.step5.beakjoon5662;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String string = sc.nextLine();
		int score = 0;
		for(int i=0;i<string.length();i++) {
			int number = string.charAt(i);
			if(number<68) {   //65 66 67 
				score+=3;
			}else if(number <71) { //68 69 70   
				score+=4;
			}else if(number<74) {  //71 72 73
				score+=5;
			}else if(number <77) { // 74 75 76
				score+=6;
			}else if(number <80) { // 77 78 79
				score+=7;
			}else if(number<84) { // 80 81 82 83
				score+=8;
			}else if(number < 87) { // 84 85 86
				score+=9;
			}else if(number<91) { // 87 88 89 90
				score+=10;
			}
			
		}
		System.out.println(score);
	}

}
