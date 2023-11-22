package baekjoon.step6.beakjoon2941;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.두번째 글자가 =이거나  -이거나
		//z이거나 
		//j이거나 일 경우  크로아티아 알파벳?
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String string = sc.nextLine();
		for(int i = 0 ; i < string.length();i++) {
			
				if(string.length()>i+1&&string.charAt(i+1)=='=') {
					if(string.charAt(i)=='c'||string.charAt(i)=='s'||string.charAt(i)=='z') {
						score+=1;
						i++;
					}
				}else if(string.length()>i+1 &&string.charAt(i+1)=='-') {
					if(string.charAt(i)=='c'&&string.charAt(i)=='d') {
						score+=1;
						i++;
					}
				}else if(string.length()>i+2  && string.charAt(i)=='d' && string.charAt(i+1)=='z' && string.charAt(i+2)=='=') {
					score+=1;
					i+=2;
				}else if(string.length()>i+1 && string.charAt(i)=='l' || string.charAt(i)=='n') {
					if(string.charAt(i+1)=='j') {
						score+=1;
						i++;
					}else {
						score+=1;
					}
				}else {
					score+=1;
				}
			
			}
			

		System.out.println(score);

	}

}
