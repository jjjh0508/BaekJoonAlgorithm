#열 개씩 끊어 출력하기
<p>
백준 알고리즘 문자열 11721번 문제
</p>

### 요구사항
알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.

한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
### 입력
첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.

### 출력

입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.

### 분석
문자열을 입력 받고 StringBuilder를 이용하여 한글자씩 어펜드 해주다가 (i+i)%10이 0이면 "\n"를 추가하여 줄 내림을 해준다
