#수 찾기
<p>
백준 알고리즘 자료구조 1920번 문제
</p>

### 요구사항
<pre>
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
<pre>

### 입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
### 출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
### 분석
<pre>
이분 탐색을 사용해서 풀어야하는 문제이다.
                               
1 2 4 7 10 17 23 24 29 31 33 42 47 가 있을때 7를 찾는 경우
int lo = 0;					// 탐색 범위의 왼쪽 끝 인덱스
int hi = arr.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스

7>arr[] 일땐    lo = mid+1; 
7<arr[] 일땐   hi= mid-1 

(lo+hi)/2 지점을 확인한다 7<arr[6]=23 일 경우  lo=0 , hi=6-1 (0+5)/2=2  7>arr[2]=4 인경우  
3+5 /2 =4             
7> arr[4]= 10 이니  4  +  4/ 2  =4 arr[4]=7




 

</pre>



###참조
https://st-lab.tistory.com/261