#숫자 카드 2
<p>
백준 알고리즘 자료구조 10816번 문제
</p>

### 요구사항
<pre>
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
<pre>

### 입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
### 출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
### 분석
-10,000,000부터 10,000,000까지 있기 떄문에  int[20000002]크기의 배열을 선언하고 입력 들어오는 크기+10000001의 인덱스의 내용을 1씩 증가 시킨 후 출력한다.

간단하게 풀었지만 이진탐색으로도 풀 수 있다고 한다.
찾아야하는 숫자의  오른쪽과 왼쪽을 찾은 후 그 차를 출력한다

왼쪽 key<= arr[mid]

오른쪽 key<arr[mid]

0+6/2

3인덱스는 2

2<2

1+3 + 6/2= 5
5인덱스는 4

4+4/2 = 4
4인덱스는 4 종료
1 1 2 2 2 4 5 


###참고
https://st-lab.tistory.com/267