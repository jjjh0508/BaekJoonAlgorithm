package baekjoon.implementation.baekjoon10828;

import java.util.Scanner;



public class Main {
	public  static int[] stack;
	public  static int size = 0; // 스택의 사이즈는 배열의 크기가 아니라 정수의 개수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		stack = new int[n];
		StringBuilder sb = new StringBuilder();
		
		for(int i= 0 ; i<n;i++) {
			String str = sc.next();
			switch (str) {
			case "push":
				push(sc.nextInt());
				break;
			case "pop":
				sb.append(pop()+"\n");
				break;
			case "size":
				sb.append(size+"\n");
				break;
			case "empty":
				sb.append(empty()+"\n");
				break;
				
			case "top":
				sb.append(top()+"\n");
				break;
			default:
				break;
			}
			
		}
		System.out.println(sb);
		

	}
	
	public static void push(int num) {
		stack[size] =  num;
		size++;
	}
	
	public static int pop(){
		if(size==0) {
			return -1;
		}else {
			int num = stack[size-1];
			stack[size-1]=0;
			size--;
			return num;
		}
	}
	public static int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int top(){
		if(size==0) {
			return -1;
		}else {
			return stack[size-1];
		}
	}

}
