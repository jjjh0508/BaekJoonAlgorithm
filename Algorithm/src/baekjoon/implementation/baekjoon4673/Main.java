package baekjoon.implementation.baekjoon4673;


public class Main {

	public static void main(String[] args) {
		int num[]= new int[10000];
		for(int i=0 ; i<num.length;i++) {
			int dnum= d(i);
			if(dnum<num.length) {   // 10000이 넘는 수가 존재한다
				num[dnum]=1;
			}
			
		}
		
	for(int i=0 ; i<num.length;i++) {
			if(num[i]!=1) {
				System.out.println(i);
			}
			
		}
	}
	
	public static int d(int n) {
		int sum  = n;            //33 의 경우
		while (n>0) {
			sum+=n%10;           //3      3
			n/=10;				 //3      0  
			                     //33+3+3 = 39 
			
		}
		
		return sum;
	}

}
