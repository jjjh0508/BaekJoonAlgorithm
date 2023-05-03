# 알고리즘 수업  - 알고리즘의 수행 시간1
<p>
백준 알고리즘 11단계 24262번 문제
</p>

### 요구사항
MenOfPassion 메소드의 수행 횟수와 최고차항의 차수를 출력한다

### 입력
1

### 출력
1
0

### 분석
MenOfPassion(A[], n) {
    i = ⌊n / 2⌋;
    return A[i]; # 코드1
}
의 실행 횟수를 구하고 n^? 의 수를 구한다
문제를 이해하지 못해서 다른 풀이를 참고하고 실행 횟수와 최고차항의 수를 구했다
이 문제는 실제 입력과 상관없이 n에 어떤 수를 입력하던 1회만 수행하게 되어있다
주어진 n회 만큼 수행하지 않고 n/2를 i에 넣고 배열안에 든 수를 리턴한다.
최고차항은 실행 횟수가 1 이기 때문에 x^0=1(X^?)이기 때문에 0이다. 
 

### 참고
https://blog.naver.com/stellaris_stella/223026405185
https://jaemin8852.tistory.com/292
https://beginnerdevdiary.tistory.com/8