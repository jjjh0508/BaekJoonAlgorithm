#단어정렬
<p>
정렬 1181번 문제
</p>

### 요구사항

알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
단, 중복된 단어는 하나만 남기고 제거해야 한다.

### 입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

### 출력
조건에 따라 정렬하여 단어들을 출력한다.

### 분석
<pre>
중복을 제거하기 위해 HashSet를 사용하여 입력 받은 후 배열로 변환
arrays.sort()를 이용해서 정렬하는데 두번째 매개변수로 comparator의 compare을 오버라이딩해서 기준을 넣어준다.
e1.length() == e2.length() 두개의 사이즈가 같다면 s1.compareTo(s2)  
출력할때 이전꺼와 비교하여 중복을 제외하여 출력한다.
</pre>

