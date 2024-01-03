package baekjoon.sorting.beakjoon11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i = 0 ; i<n ;i++) {
			st= new StringTokenizer(br.readLine());
			arr[i][0]= Integer.parseInt(st.nextToken());
			arr[i][1]= Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(arr, (e1,e2)->{  // e1에 arr[0][0],[0][1]이  e1[0],e1[1] 형식으로 나눠서 들어간다
			if(e1[0]==e2[0]) {      //앞 자리가 같을 경우 뒤에 [1]자리를 비교하여 리턴하는데 앞자리가 크면 양수 같으면 0 작으면 음수를 리턴한다
				return e1[1]-e2[1];    
			}else {
				return e1[0]-e2[0];
			}
			
		});
		
		for(int i = 0 ; i <n; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}

}
