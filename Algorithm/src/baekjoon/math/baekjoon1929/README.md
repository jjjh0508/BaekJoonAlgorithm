#소수 구하기
<p>
백준 알고리즘 수학 1929번 문제
</p>

### 요구사항
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
### 입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
### 출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
### 분석
에라토스테네스의 체를 사용해서 푸는 문제이다.

1. 2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다.
2. 2는 소수이므로  2를 쓴다.
3. 자기 자신을 제외한 2의 배수를 모두 지운다.
4. 3은 소수 이므로 3를 쓴다
5. 자신을 제외한 3의 배수를 제외한다.
6. 5는 소수이므로 5를 쓴다
7. 자신을 제외한 5의 배수를 제외한다.
8. 7은 소수 이므로 7를 쓴다.
9. 자신을 제외한 7의 배수를 제외한다.
10. 위 과정을 반복하면 구하는 구간의 모든 소수가 남는다.

boolean 배열을 선언 후  2부터 입력 받은 N까지 수를 true로 바꾸고 
2를 제외한 2의 베수를 제거하기 위해 2부터 m까지 i+i를 false로 바꿔준다.for(int i = 2 ; i <= m ; i++){for(int j=i+i;j<=m;j+=i} 
배열 value가  true인 인덱스만 출력해준다


###참고
https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4