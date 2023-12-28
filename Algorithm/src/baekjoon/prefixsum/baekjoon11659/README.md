#구간 합 구하기 4
<p>
누적합 11659 문제
</p>

### 요구사항

수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 

둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.

 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
### 출력

총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

### 분석
<pre>
수의 갯수 N과 합을 구해야하는 M이 주워지고, 
두번 째 줄 N개 의 수가 주워진다. 
3번째 줄에 i부터 j까지 주워진다.
for문을 사용하여 i 부터 j까지 계산후 출력하면 시간 초과가 나온다 .
해결하기 위해 수를 입력 받아을때  배열을 n+1로 선언 하고  num[i] =num[i-1] + 입력되는 수를 하여
미리 더 해놓고 출력할때  num[j] - num[i-1] 해주면 i 부터 j 까지의 합이 나온다.
i= 1 , j= 3일 경우
num[j]= 12이고 num[i]= 0 이니 12 - 0 은 12가 답이된다.

0
5
9
12
14
15
<pre>