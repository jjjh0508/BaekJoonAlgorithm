package baekjoon.math.baekjoon1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		for(int i = 1 ; i <=x-1;i++) { //-1하는 이유는 입력 월의 경우 일(y)이 이미 입력됨
			if(i==2) {
				y+=28;
			}else if(i==4 || i==6 || i==9 || i==11) {
				y+=30;
				
			}else {
				y+=31;
			}
			
		}
		
		switch (y%7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		default:
			break;
		}

	}

}
