package baejoon;
/*
 * 더해주는 초를 60으로 나눈 나머지를 초에 더한다
 * 분에 더해주는 초를 60으로 나눠서 더한다
 * 분에 초를 60으로 나눠서 더한다
 * 시간에 분을 60으로 나눠서 더한다
 * 출력할때 시간에 24나머지 분에 60나머지 초에 60나머지 하면 
 * 
 */
import java.util.Scanner;

public class BaeJoon2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute =sc.nextInt();
		int seconds =sc.nextInt();
		int cookSeconds = sc.nextInt();
		
		seconds += cookSeconds%60;
		minute+= cookSeconds/60;
		
		minute+= seconds/60;
		
		hour += minute/60;
		
		System.out.println(hour%24+" "+minute%60+" "+seconds%60);
		
		
	}

}
