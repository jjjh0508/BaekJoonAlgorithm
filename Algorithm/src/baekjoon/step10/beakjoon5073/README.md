# 삼각형과 세 변
<p>
기하: 직사각형과 삼각형 5073번 문제
</p>

### 요구사항

<p>
삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다. <br>
Equilateral :  세 변의 길이가 모두 같은 경우 <br>
Isosceles : 두 변의 길이만 같은 경우 <br>
Scalene : 세 변의 길이가 모두 다른 경우 <br> 
단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다. 예를 들어 6, 3, 2가 이 경우에 해당한다. 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지  못한다.

세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
</p>

### 입력
각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다. 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.

### 출력
각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.

### 분석
가장 긴 변의 길이와 다른 두 변의 길이의 합을 비교하여 삼각형의 조건을 만족하는지 보고
세변의 길이가 같은 경우 두변의 길이만 다른경우 , 세변의 길이가 모두 다른 경우를 찾는다