#피보나치 수 5
<p>
백준 알고리즘 구현 10870번 문제
</p>

### 요구사항
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.


### 입력
첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
### 출력
첫째 줄에 n번째 피보나치 수를 출력한다.
### 분석
<pre>
Fn = Fn-1 + Fn-2 <br>
배열을  이용하여 0,1인덱스에 0,1를 넣어놓고 i=2 부터 시작하여 num[i-2] +num[i-2]
int [n+1] num <br>

num[0]=0  <br>
num[1]=1  <br>


if(n>0){

for(i=2; i<= n ; i++){ <br>
		num[i]=num[i-2]+num[i-1] <br>
	
} <br>
}
</pre>
0이 입력 될 경우 크기 1 짜리 배열이 생성되는데 [1]에 접근하기 때문에 ArrayIndexOutOfBounds 에러가 난다
if(n>0)으로 체크해줘야한다
