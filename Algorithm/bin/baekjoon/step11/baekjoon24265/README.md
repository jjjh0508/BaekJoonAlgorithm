#알고리즘 수업- 알고리즘 수행 시간4
<p>
알고리즘 11단계 24265번 문제
</p>

### 요구사항

오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다 </br>
아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자 </br>
입력의 크기n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자 </br>
MenOfPassion(A[],n){  </br>
  sum <- 0;  </br>
    for i <- 1 to n - 1  </br>
        for j <- i + 1 to n  </br>
            sum <- sum + A[i] × A[j]; # 코드1  </br>
    return sum; </br>
} </br>

### 입력
7  </br>
첫쨰 줄에 입력의 크기 n(1<=n<=500,000)이 주어진다
 </br>
### 출력
21  </br>
2  </br>
첫쨰 줄에 코드1의 수행 횟수를 출력한다  </br>
둘 쨰 줄에 코드1의 수행 횟수를 다항식으로 나타내었을떄 , 최고 차항의 차수를 출력한다. 단 , 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
### 분석
이중 for 문으로 밖 for가 돌 떄 안 for문은 i-1번을 수행한다  </br>
i<=6, 이면  2, 3, 4, 5, 6, 7 </br>
i<=5, 이면 3, 4, 5, 6, 7  </br>
i<=4, 이면 4, 5, 6, 7  </br>
반복 횟수는 (n-1)+(n-2)+(n-3)....  </br>
(n*n-1)/2