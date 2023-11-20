package baekjoon.step5.beakjoon1152;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		String[] string = sentence.split(" ");
	
		if(string.length==0) {
			System.out.println(string.length);
		}else if(!string[0].equals("")) {
			System.out.println(string.length);
		}else {
			System.out.println(string.length-1);
		}
		
	}

}
