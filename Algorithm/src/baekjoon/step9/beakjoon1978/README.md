#소수 찾기
<p>
약수, 배수와 소수 1978번 문제
</p>

### 요구사항

<p>
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
</p>

### 입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

### 출력
주어진 수들 중 소수의 개수를 출력한다.


### 분석
회수 n을 입력 받아 n개의 배열을 만들고 n개를 입력 받는다.
반복하면서 약수를 찾고 1과 자신을 제외한 다른 약수가 나오면 건너뛴다.
1과 자신만 있으면 저장, 입력 받은 수가 1이라면 제외한다