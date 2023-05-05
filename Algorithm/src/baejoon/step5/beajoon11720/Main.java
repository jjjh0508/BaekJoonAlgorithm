package baejoon.step5.beajoon11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum=0;
		for(byte value:br.readLine().getBytes()) {
			sum+=(value-'0');
		}
		br.close();
		System.out.println(sum);
	}

}