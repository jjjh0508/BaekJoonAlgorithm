#집합
<p>
백준 알고리즘 구현 11723번 문제
</p>

### 요구사항
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.

remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.

check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)

toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)

all: S를 {1, 2, ..., 20} 으로 바꾼다.

empty: S를 공집합으로 바꾼다.


### 입력
첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.

둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.
### 출력
check 연산이 주어질때마다, 결과를 출력한다.
### 분석
10718문제와 비슷해보인다. 

수행 횟수와 기능, 수를 입력 받아서 수행하고 출력한다.

공집합 S에는 1부터 20까지 들어 갈 수 있으며 add의 경우 S에 x를 추가하는 이미 있는 경우 무시하기 때문에

공집합  S를 hashset으로 만들고 중복이 될 수 없게 한다.

pintln으로 출력하면 시간 초과된다.
stringbuilder로 append후 출력

