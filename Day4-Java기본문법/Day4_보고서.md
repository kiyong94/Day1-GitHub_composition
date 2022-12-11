  
# Day4 :  Java언어의  기본  문법  보고서

  
## 01. 제어문

<br>

>### 반복문

1. `for`문 : 반복되어야 할 범위가 명확히 수치적으로 구현 가능한 경우에 유용한 반복문

```
for(초기식; 조건식; 증감식){
	반복수행 코드
}
```

  

- 실습 : 구구단 2단을 출력

```
public class Test {

	public static void main(String[] args) {
		for(int i=1 ; i<=9 ; i++){
		System.out.println(2 + " X " + i + " = " + (2*i));
		}
	}
}
```
```
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
```

  

2. `while`문 : 반복 범위가 명확히 규정되어 있지는 않지만, 코드의 반복 수행 종료 조건이 정해져 있을 경우 유용한 반복문

```
while(조건식){
	반복수행 코드
}
```

- 실습 : 구구단 2단을 출력

```
public class test {

	public static void main(String[] args) {
		int i = 1;
		while(i<=9){
			System.out.println(2 + " X " + i + " = " + (2*i));
			i++;
		}
	}
}
```
```
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
```

  

3. `do~while`문 : `while`문과 유사하지만, 차이점은 조건식의 결과에 관계없이 최초 한번은 반복 코드를 수행한다.

```
do{
	반복수행 코드
} while(조건식)
```

  

- 실습 : 구구단 2단을 출력

```
public class test {

	public static void main(String[] args) {
		int i = 1;
		do{
			System.out.println(2 + " X " + i + " = " + (2*i));
			i++;
		}while(i<=9);
	}
}
```
```
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
```

5. `break`문 : 반복문 내에서 `break`가 수행되면 해당 반복문의 조건식 만족 여부와 상관없이 바로 빠져나간다.

  

- 실습 : 구구단 2단 출력 중 `i`가 5가 되는 시점에 종료하기

```
public class test {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++){
			if(i==5){
				System.out.println("break문 실행");
				break;
			} System.out.println(2 + " X " + i + " = " + (2*i));
		}
	}
}
```
```
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
break문 실행
```

5. `continue`문 : 현재 수행 중인 반복 주기를 건너뛰고 다음 반복 단계로 넘어간다.

- 실습 : 구구단 2단 출력 중 `i`가 5가 되는 시점에 다음 반복 단계로 넘어가기.

```
public class test {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++){
			if(i==5){
				System.out.println("continue문 실행");
				continue;
			} System.out.println(2 + " X " + i + " = " + (2*i));
		}
	}
}
```
```
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
continue문 실행
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
```

---

<br>

>### 조건문

1. `if`문 : 단일 조건의 만족 여부에 따라 실행될 코드를 지정하거나 여러 조건에 따라 각각 실행 될 코드를 지정 또는 어떠한 조건도 만족하지 않았을 때 수행할 코드를 지정하기 위해 사용.

- 조건이 하나일 경우
```
if(조건){
	수행 코드
}
```

- 조건이 참과 거짓 두 가지일 경우
```
if(조건){
	수행코드1
} else{
	수행코드2
}
```

- 조건이 여러 가지일 경우
```
if(조건1){
	수행 코드1
} else if(조건2){
	수행 코드2
} else if(조건3){
	수행 코드3
	
....

} else{
	수행코드
}
```

  

2. `switch ~ case`문 : 수행 코드 분기를 위한 조건이 단 하나 이면서 그 조건의 결과값이 여러 개 발생할 때 유용하게 사용.

```
switch(조건){
	case 결과값1 : 수행코드;
	  break;
	case 결과값2 : 수행코드;
		break;
		
	....
	
	case 결과값n : 수행코드;
		break
	default : 수행코드;
}
```

---

<br>

## 02. 배열

>### 배열

- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것을 배열이라고 한다. 많은 양의 데이터를 저장 가능하다.

- 다음과 같이 여러 개의 `int`값을 다루는 경우 여러 개를 각각의 변수로 선언하는 것이 아닌 하나의 배열로 묶을 수 있다.

```
int a1, a2, a3, a4, a5;		// 각각의 변수로 선언
  
int[] a = new int[5];		// 5개의 int 값을 저장할 수 있는 배열 생성
```

---

<br>

>### 배열의 선언과 생성

- 배열의 선언 : 배열을 선언하는 것은 단지 생성된 배열을 다루기 위한 참조 변수를 위한 공간이 만들어질 뿐이다.

  
- 배열을 선언하는 방법은 원하는 타입의 변수를 선언하고 대괄호 `[]`를 붙이면 된다. 
	- 대괄호는 타입 뒤에 붙여도 되고 변수 이름 뒤에 붙여도 되는데, 일반적으로 타입의 뒤에 붙인다.

```
int[] score;
String[] name;

int score[];
String name[];
```

  

- 배열의 생성 : 배열을 생성해야 값을 저장할 수 있는 공간이 만들어진다. 
	- 배열을 생성하기 위해서는 연산자 `new`와 함께 배열의 타입과 길이를 지정해 주어야 한다.

```
타입[] 변수이름; 				// 해당 타입의 배열 선언 (참조변수 선언)
변수이름 = new 타입[길이]; 	// 해당 타입의 배열 생성 (실제 저장 공간 생성)

int[] arr; 					// int 타입 배열을 다루기 위한 참조변수 arr 선언
arr = new int[5]; 			// 메모리의 빈 공간에 5개의 int형 테이터를 저장할 수 있는 공간이 할당됨
							// 할당된 공간은 자동적으로 int의 기본값인 0으로 초기화된다.
							// 대입연산자 '='에 의해 배열의 주소가 int형 배열 참조변수 arr에 저장된다.

int[] arr = new int[5]; 	// int타입 배열의 선언과 생성을 한줄로 수행
```

  

---

<br>

>## 배열의 길이와 인덱스

- 생성된 배열의 각 저장 공간을 배열의 요소라고 하며, `배열이름[인덱스]`의 형식으로 각 요소에 접근할 수 있다.

- 인덱스는 배열의 요소마다 붙여진 일련번호로 각 요소를 구별하는데 사용된다.

- 주의할 점은 인덱스가 1이 아닌 0부터 시작한다는 것이다. 

```
int[] arr = new int[5];
arr[3] = 100;
int value = arr[3];

System.out.println(arr[3]);
System.out.println(value);
```
```
100
100
```

- 반복문의 제어 변수를 배열의 인덱스로 사용하여 값을 출력 할 수 있다.
```
for(int i = 0; i < 5; i++) {
	System.out.println(arr[i]);
}
```
```
0
0
100
0
0
```

- 수식이 인덱스로 사용되는 경우 해당 수식이 먼저 계산되어 인덱스를 구한다.

```
int i = 1;
int temp = arr[i + 1];
```
- 만약 인덱스의 범위를 넘어가는 값을 인덱스로 주는 경우 `ArrayIndexOutOfBoundsException`이 발생한다.
```
System.out.println(arr[5]); 
```
```
// 에러 : ArrayIndexOutOfBoundException 발생 -> 최대 인덱스인 4보다 큰 값이 인덱스로 주어져 에러 발생
```

-  `배열이름.length` : 자바에서는 `배열이름.length`를 통해서 배열의 길이에 대한 정보를 얻을 수 있다.

  

```
int[] arr = new int[5];
System.out.println(arr.length);
```
```
5
```

- 배열은 한번 생성하면 길이를 변경할 수 없으므로, 이미 생성된 배열의 길이는 변하지 않는다. 
	- 즉,  `배열이름.length`는 상수이고, 값을 읽을 수만 있을 뿐 변경할 수 없다.

  

- 반복문의 조건식에 배열의 길이를 사용하여 배열에 있는 모든 요소를 탐색하는데 사용할 수 있다.

```
int[] test = new int[5];

for (int i = 0; i < test.length; i++){
	System.out.println(test[i]);
}
```

- `for`문의 조건식에 배열의 길이를 직접 적기보다 `배열이름.length`를 사용하는 것이 좋다.

	- 배열의 크기를 수정하였을 때, 일일이 조건식을 변경하기보다는, `배열이름.length`를 조건식에 넣어서 수정된 부분이 바로 적용될 수 있도록 하는 것이 효율적이기 때문에.

---

<br>

>### 배열의 초기화

- 배열은 원래 생성과 동시에 자동으로 자신의 타입에 해당하는 기본값으로 초기화된다. 따로 초기화하지 않아도 되지만, 원하는 값을 저장하고 싶다면 값을 지정해야 한다.

```
int[] test = new int[5];
test[0] = 10;
test[1] = 20;
test[2] = 30;
test[3] = 40;
test[4] = 50;
```

- 배열에 지정하는 값에 규칙이 있다면 `for`문으로도 초기화 할 수 있다.

```
int[] test = new int[5];
for (int i = 0; i < test.length; i++){
	test[i] = (i + 1) * 10;
	}
```

- 배열의 생성과 초기화를 동시에 할 수 있는 방법도 있다.

```
int[] test = new int[] {10, 20, 30, 40, 50};
int[] test = {10, 20, 30, 40, 50}; 				// new int[] 생략 가능. 더 간단!
```

---

<br>

## 03. 연산자

<br>

>### 산술 연산자

- 가장 기본이 되는 연산자로 4칙 연산( `+` , `-` , `*` , `/` )과 나머지 값을 구하는 나머지 연산자( `%` )가 있다.

```
int x = 10;
int y = 5;

System.out.println(x + " + " + y + " = " + (x + y));
System.out.println(x + " - " + y + " = " + (x - y));
System.out.println(x + " * " + y + " = " + (x * y));	
System.out.println(x + " / " + y + " = " + (x / y));
System.out.println(x + " % " + y + " = " + (x % y));	
```
```
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
10 % 5 = 0
```

---

<br>

>### 증감 연산자

- 증감 연산자는 피 연산자의 값을 1씩 증가 또는 감소 시키는 연산자이다. 
- 증감 연산자가 변수 앞에 위치하느냐 변수 뒤에 위치하느냐에 따라 결과 값이 달라진다.

	-  `++A` : A의 값을 1 증가 시킨 후 A를 처리
	-  `A++` : A를 처리한 후 A의 값을 1 증가 시킴
	-  `--A` : A의 값을 1 감소 시킨 후 A를 처리
	-  `A--` : A를 처리한 후 A의 값을 1 감소 시킴

```
int x = 10;

System.out.println("현재 x의 값 = " + x); 
System.out.println("++x 출력 = " + (++x)); 
System.out.println("현재 x의 값 = " + x); 
System.out.println("x++ 출력 = " + (x++)); 
System.out.println("현재 x의 값 = " + x); 
System.out.println("--x 출력 = " + (--x)); 
System.out.println("현재 x의 값 = " + x); 
System.out.println("x-- 출력 = " + (x--)); 
System.out.println("현재 x의 값 = " + x); 
```
```
현재 x의 값 = 10
++x 출력 = 11
현재 x의 값 = 11
x++ 출력 = 11
현재 x의 값 = 12
--x 출력 = 11
현재 x의 값 = 11
x-- 출력 = 11
현재 x의 값 = 10
```

---

<br>

>### 비교 연산자

- 두 개의 피 연산자 값을 비교하기 위해 사용한다. 
- 결과값은 참과 거짓으로 도출되므로 `boolean` 타입의 `true`와 `false` 값이 연산자의 결과값이 된다.

	-  `A == B` : A와 B의 값이 같다.
	-  `A != B` : A와 B의 값이 같지 않다.
	-  `A > B` : A가 B의 값보다 크다.
	-  `A >= B` : A가 B의 값보다 크거나 같다.
	-  `A < B` : A가 B의 값보다 작다.
	-  `A <= B` : A가 B의 값보다 작거나 같다.

```
int a = 10;
int b = 3;

System.out.println("a > b : " + (a > b)); 
System.out.println("a >= b : " + (a >= b)); 
System.out.println("a < b : " + (a < b)); 
System.out.println("a <= b : " + (a <= b)); 
System.out.println("a == b : " + (a == b)); 
System.out.println("a != b : " + (a != b)); 
```
```
a > b : true
a >= b : true
a >= b : true
a < b : false
a <= b : false
a == b : false
a != b : true
```
 
---

<br>

>### 논리 연산자

-  `boolean` 데이터 타입의 값인 `true`와 `false`의 값의 논리적 연산에 사용된다.

	- 1. `A && B` : A의 값과 B의 값이 모두 `true`일 경우 `true`, 그 외에는 `false` ( AND연산 )
	- 2. `A || B` : A의 값과 B의 값이 모두 `false`일 경우 `false`, 그 외에는 `true` ( OR연산 )
	- 3. `!A` : A의 값이 `true`일 경우 `false`, `false`일 경우 `true` ( 논리 부정 연산 )

```
int num1 = 10;
int num2 = 5;

boolean bool1 = num1 > num2; 		// true
boolean bool2 = num1 < num2; 		// false
boolean bool3 = num1 == num2; 		// false
boolean bool4 = num1 != num2; 		// true

System.out.println("bool1 && bool2 : " + (bool1 && bool2)); 
System.out.println("bool1 || bool2 : " + (bool1 || bool2)); 
System.out.println("bool1 && bool4 : " + (bool1 && bool4)); 
System.out.println("bool2 || bool3 : " + (bool2 || bool3)); 
```
```
bool1 && bool2 : false
bool1 || bool2 : true
bool1 && bool4 : true
bool2 || bool3 : false
```

---

<br>  

>### 대입 연산자

- 특정한 상수 값이나 변수 값 또는 객체를 변수에 전달하여 기억시킬 때 사용하는 연산자이다.

	- `A = B` : A에 B의 값을 대입
	- `A += B` : A값에 B값을 더한 결과값을 A에 대입
	- `A -= B` : A값에 B값을 뺀 결과값을 A에 대입
	- `A *= B` : A값에 B값을 곱한 결과값을 A에 대입
	- `A /= B` : A값에 B값을 나눈 결과값을 A에 대입 
	- `A %= B` : A값에 B값을 나눈 나머지 결과값을 A에 대입

  

```
int a = 10;
int b = 3;

a = b;
System.out.println("현재 a의 값 : " + a); 

a += b;
System.out.println("현재 a의 값 : " + a); 

a -= b;
System.out.println("현재 a의 값 : " + a); 

a *= b;
System.out.println("현재 a의 값 : " + a); 

a /= b;
System.out.println("현재 a의 값 : " + a); 

a %= b;
System.out.println("현재 a의 값 : " + a); 
```
```
현재 a의 값 : 3
현재 a의 값 : 6
현재 a의 값 : 3
현재 a의 값 : 9
현재 a의 값 : 3
현재 a의 값 : 0
```

---

<br>

>### 삼항 연산자

- 세 개의 피 연산자를 통해 조건을 만족할 때와 만족하지 않을 때 반환할 결과값을 지정해줄 수 있는 연산자.

```
(조건) ? 결과값1 : 결과값2
```

- 실습
```
int a = 3;
System.out.println((a%2 == 0) ? "a는 짝수" : "a는 홀수");
```
```
a는 홀수
```
  
---

<br>

## 04. 예외 처리(exception handling)

>### 예외 처리의 개념

- 예외 처리란 프로그램 실행 흐름 상 오류가 발생했을 때 그 오류를 대처하는 방법, 프로그램 실행 도중 예외 상황이 발생해도 비정상 종료 없이 끝까지 진행할 수 있도록 코드를 작성하는 것

  

-  `Error` VS `Exception`

	- `Error` : 프로그램이 동작하는 VM(가상머신)에 발생한 심각한 오류, 발생하면 애플리케이션 비정상 종료

	- `Exception` : 프로그래머가 만든 프로그램이 잘못된 방향으로 갈 때 생기는 오류, 수습이 가능한 덜 심각한 오류.

-  `Throwble` : 자바 최상위 객체인 `Object`를 필두로 최상위 객체인 `Throwble` 을 상속받는 `Error` 와 `Exception` 이 있다.

---

<br>

>###  예외 처리하기 : try-catch

-  `try-catch` : `Exception` 감지 및 처리를 위한 구문

```
try{
	예외가 발생할 수 있는 코드
} catch (Exception e1){
	Exception1 발생 시 이를 처리하기 위한 코드
} catch (Exception e2){
	Exception2 발생 시 이를 처리하기 위한 코드

...

} cath (Exception eN){
	ExceptionN 발생 시 이를 처리하기 위한 코드
}
```

  

-  `try` 블럭 내에서 예외가 발생한 경우

	- 1. 발생한 예외와 일치하는 `catch` 블럭 검색

	- 2. 일치하는 `catch` 블럭이 있다면, 그 블럭 내 문장 수행 후 전체 `try-catch` 구문 빠져나감. (없다면 예외 처리X)


-  `try` 블럭 내에서 예외가 발생하지 않은 경우

	- `catch` 블럭을 거치지 않고 전체 `try-catch` 구문을 빠져나감.


- 실습 : 반복문 `for`문을 통해 순차적으로 배열의 값을 출력하는 코드이다. 하지만, 이 코드는 수행 시 에러가 발생한다.

```
String[] strings = new String[]{"one", "two", "three"};
	for (int i = 0; i < 4; i++) {
	System.out.println(strings[i]);
}
```
```
// 오류 : Exception in thread "main" java.lang.Error: Unresolved compilation problem:
```

  

- 이 코드를 `try-catch`문을 사용해 에러가 발생하지 않게 만들어보자.

```
String[] strings = new String[]{"one", "two", "three"};

try {
	for (int i = 0; i < 4; i++) {
		System.out.println(strings[i]);
	}
} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Empty");
}
```
```
one two three Empty
```

-  `printStackTrace()` : 예외 발생 당시 호출 스택(Call Stack)에 있었던 메서드의 정보와 예외 메세지를 화면에 출력.

-  `getMessage()` : 발생한 예외 클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.

-  `finally` : 예외 발생 여부와 상관없이 무조건 수행되어야 할 로직이 있을 경우 사용하는 블럭. 
	- 예외가 발생하지 않는다면 `try` 블럭 이후 `finally` 블럭이 수행된다. (커넥션 풀 종료, 임시 파일 삭제 등)

```
try{
	예외가 발생할 수 있는 코드
} catch (Exception e1){
	Exception1 발생 시 이를 처리하기 위한 코드
} catch (Exception e2){
	Exception2 발생 시 이를 처리하기 위한 코드
	
...

} finally{
	최종적으로 반드시 처리해야하는 작업
}
```

---

<br>

>### 예외 발생 시키기

-  `throw` 키워드를 사용하면 개발자가 의도적으로 예외를 발생 시키는 것이 가능하다.

- 주로 사용자가 구현하는 비즈니스 로직에서 컴파일의 문법 오류는 없지만 로직 자체가 개발자가 의도 한대로 진행 되는지에  대한 검증 로직을 통과하지 못했을 경우에 고의로 예외를 발생 시켜야 할 때 사용한다.

```
try{
	throw new Exception("고의 발생 예외"); 		// new 키워드로 발생시키고자 하는 예외 객체 바로 생성
} catch(Exception error){

error.printStackTrace();

System.out.println("Invalid str: "+error.getMessage());
}
```
```
java.lang.Exception: 고의 발생 예외

at test.main(test.java:5)

Invalid str: 고의 발생 예외
```

- 메서드에 예외 선언하기 (예외 던지기 : `throws`) : 메서드레벨에서 예외를 선언할 수 있다. 메서드 레벨에서 선언한 예외와 그 자손 타입까지 발생할 수 있다는 걸 의미한다.
	- `throws RuntimeException` 을 선언할 경우 `RuntimeException`을 상속하는 하위 예외객체들 모두가 발생 할 가능성이 있다.

  

- 실습

```
public class Sample {

public void userId(String userId) throws Exception1 {
	if("kky".equals(userId)) {
	throw new Exception1();
	}
	
System.out.println("당신의 id는 "+ kky +" 입니다.");
}

public static void main(String[] args) {
	Sample sample = new Sample();
	try {
		sample.userId("kky");
		sample.userId("ksh");
	} catch (Exception1 e) {
		System.err.println("Exception1이 발생했습니다.");
	}
}
}
```

---

<br>  

>### 사용자 정의 예외

- 사용자 정의 예외 : 자바 표준 API가 제공하는 예외 클래스 만으로 다양한 종류의 예외를 다 표현할 수 없다. 이때, 직접 정의하여 사용하는 예외를 사용자 정의 예외라고 합니다.

- 사용자 정의 예외는 반드시 `java.lang.Exception` 클래스를 상속 받아 정의해야 한다.

- 예외 생성 하기 : `throw new 사용자정의예외()`

- 실습 : 두 값을 더하는 sum() 함수에서 음수 값이 들어가는 경우 예외 처리해주는 사용자 정의 예외 처리를 만들기.

```
import java.util.Scanner;
import java.lang.Exception;

class elementException extends Exception {
	
	public elementException(String a) {
		super(a);	// super : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용
	}
}

	public class test {
		public static int sum() throws elementException {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a<0 || b<0) {
				throw new elementException("음수 값 입력 금지");
			}
			return a+b;
		}

		public static void main(String[] args) {
			try {
				System.out.printf("합 : %d", sum());
				System.out.println(" sum 함수 실행 완료");
			} catch (elementException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("try catch 문 실행 완료");
		}
	}
}
```

- 변수 `a`에 5,  `b`에 3 을 입력했을 때 결과

```
합 : 8 sum 함수 실행 완료
try catch 문 실행 완료
```

- 변수 `a`에 5,  `b`에  -1 을 입력했을 때 결과

```
음수 값 입력 금지
try catch 문 실행 완료
```

---

<br>

## 05. 클래스(class)

<br>

>### 클래스란?

-  `객체 지향 프로그래밍(OOP, Object-Oriented Programming)`
	- 객체 지향 프로그래밍에서는 모든 데이터를 `객체(object)`로 취급하며, 객체가 프로그래밍의 중심이 된다.

-  `Class(클래스)` 와 `Object(객체)`

	- `클래스` : 프로그래머가 필요에 의해 직접 만들어둔 데이터 타입, 어떻게 메모리를 빌려 올지에 대해 정의해둔 문서

	- `객체` : 클래스를 사용해서 그 내용대로 메모리를 빌려온 상태를 지칭, 클래스에 설명 되어있는대로 메모리를 빌려온 상태, 메모리에 구현해둔 상태

-  `Instance(인스턴스)`
	- 클래스 로부터 객체를 선언하는 과정을 클래스의 `인스턴스화` 라고 한다. 또한, 이렇게 선언된 해당 클래스 타입의 객체를 `인스턴스(instance)`라고 한다. 즉, 인스턴스란 메모리에 할당된 객체를 의미.

-  `메소드(method)`
	- 자바에서 클래스는 멤버(member)로 속성을 표현하는 `필드(field)`와 기능을 표현하는 `메소드(method)`를 가집니다.                                       그 중에서 `메소드(method)`란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.

---

<br>

>### 클래스의 구성 및 사용

- 클래스의 구성요소 예시 코드

```
class Car { 									// 클래스 이름

	private String modelName; 					// 필드
	private int modelYear;			  			// 필드

	Car(String modelName, int modelYear) { 		// 생성자
		this.modelName = modelName;
		this.modelYear = modelYear;
	}

	public String getModel() { 					// 메소드
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
}
```

1. 필드
: `필드(field)`란 클래스에 포함된 `변수(variable)`를 의미한다. 여러 개 사용이 가능하지만 변수의 이름은 중복될 수 없다. 클래스 내에서 필드는 선언된 위치에 따라 구분됩니다.

- 종류
(1) 지역 변수
	- 클래스 안에 선언되어있는 메서드 안에서 선언된 변수
	- 해당 메서드 내부에서만 사용가능

	(2) 클래스 변수
	- 클래스당 단 하나만 생성
	- 모든 인스턴스 / 객체 가 공유해서 사용
	- 사용시 참조변수.변수(X) / 클래스이름.변수(O)
	- 클래스 변수는 객체 생성없이 사용 가능

	(3) 인스턴스 변수
	- 인스턴스 당(객체당) 하나씩 생성
	- 각 인스턴스/객체가 독립적인 값을 가진다.
	- 사용시 참조변수.변수(O)
	- 인스턴스 변수는 객체 생성 전에는 사용 불가능

  

```
class Car {

static int modelOutput; // 클래스 변수
String modelName; 		// 인스턴스 변수

void method() {
	int something = 10; // 지역 변수
	}
}
```

  

<br>

2. 메서드
: 어떠한 특정 작업을 수행하기 위한 명령문의 집합. 클래스 내에 정의된 데이터를 가공 및 활용하기 위한 기능 부분 정의.

```
public class ClassName{ 						
	접근제어자 반환타입 메소드이름(매개변수목록) { 	// 구현부, 메서드 시작
	} 											// 메서드 종료
} 												
```

  

<br>

  

3. 생성자
: 즉 클래스의 객체를 생성할 때 클래스의 멤버 변수들의 초기화에 사용되는 요소. 생성자를 클래스 내 하나도 작성하지 않으면 기본 생성자가 생성된다.

```
public class ClassName{ 	
	ClassName(매개변수목록){ 	// 생성자 시작
	} 						// 생성자 종료
} 
```

---

<br>  

>### 클래스의 선언

- 자바에서 클래스를 선언하는 방법은 접근 제어자와 함께 `class` 키워드를 사용하면 된다.

```
접근제어자 class 클래스이름 {
	접근제어자 필드1의타입 필드1의이름;
	접근제어자 필드2의타입 필드2의이름;

	...

	접근제어자 메소드1의 원형
	접근제어자 메소드2의 원형

	...

}
```

  

<br>

  

-  인스턴스의 생성

```
클래스이름 객체참조변수이름 = new 클래스이름();
```

- 예시 : `Car` 객체의 인스턴스를 생성

```
Car myCar = new Car();
```

-  `메소드` 호출 : 멤버 참조 연산자(`.`)를 사용하여 호출할 수 있습니다.

	- `객체참조변수이름.메소드이름();` : 매개변수가 없는 메소드의 호출
	- `객체참조변수이름.메소드이름(인수1, 인수2, ...);` : 매개변수가 있는 메소드의 호출

- 예제 : `accelerate()` 메소드를 정의하고 호출

```
class Car {
	private int currentSpeed;
	private int accelerationTime;

	public void accelerate(int speed, int second) {
		System.out.println(second + "초간 속도를 시속 " + speed + "(으)로 가속함!!");
	}
}

public class Method01 {
	public static void main(String[] args) {
		Car myCar = new Car();			 				// 객체 생성
		myCar.accelerate(60, 3); 		 				// 메소드 호출
	}
}
```

---

<br>  

>### 추상 클래스(abstract class)

- 자바에서는 하나 이상의 추상 메소드를 포함하는 클래스를 가리켜 `추상 클래스(abstract class)`라고 합니다. 이러한 추상 클래스는 객체 지향 프로그래밍에서 중요한 특징인 "다형성" 을 가지는 메소드의 집합을 정의할 수 있도록 해준다.

- 즉, 반드시 사용되어야 하는 메소드를 추상 클래스에 추상 메소드로 선언해 놓으면, 이 클래스를 상속받는 모든 클래스에서는 이 추상 메소드를 반드시 재정의해야 합니다.

- 추상 클래스의 선언

```
abstract class 클래스이름 {

	...

	abstract 반환타입 메소드이름();

	...

}
```

  

- 이러한 추상 클래스는 동작이 정의되어 있지 않은 추상 메소드를 포함하고 있으므로, 인스턴스를 생성할 수 없습니다.

  

- 추상 클래스는 먼저 상속을 통해 `자식 클래스`를 만들고, 만든 자식 클래스에서 추상 클래스의 모든 추상 메소드를 오버라이딩 하고 나서야 비로소 자식 클래스의 인스턴스를 생성할 수 있게 됩니다.

  

- 아래 예제에서 추상 클래스인 `Animal` 클래스는 추상 메소드인 `cry()` 메소드를 가지고 있습니다. `Animal` 클래스를 상속받는 자식 클래스인 `Dog` 클래스와 `Cat` 클래스는 `cry()` 메소드를 오버라이딩 해야만 비로소 인스턴스를 생성할 수 있습니다.

```
abstract class Animal {
	abstract void cry();
}

class Cat extends Animal { 				// Animal 클래스를 상속받다.
	void cry() {
		System.out.println("냐옹냐옹!");
	}
}

  

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍!");
	}
}
 
public class Polymorphism02 {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();

		c.cry();
		d.cry();
	}
}
```

  

<br>

  

- 추상클래스의 사용목적 : 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함입니다. 만약 일반 메소드로 구현한다면 사용자에 따라 해당 메소드를 구현할 수도 있고, 안 할 수도 있습니다.

---

<br>

## 06. 상속

<br>

>### 상속의 개념

-  `상속(inheritance)` : 기존의 클래스에 기능을 추가하거나 재정의하여 새로운 클래스를 정의하는 것을 의미.

	- 상속을 이용하면 기존에 정의되어 있는 클래스의 모든 필드와 메소드를 물려받아, 새로운 클래스를 생성할 수 있다.

	- 자바에서 클래스는 단 한 개의 클래스만을 상속받는 `단일 상속`만이 가능합니다.

	- 부모 클래스 데이터 타입의 크기는 항상 자식 클래스 데이터 타입보다 크다.

- 상속의 장점

	- 기존에 작성된 클래스를 재활용할 수 있습니다.

	- 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 됩니다.

	- 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련합니다.

-  `부모 클래스(parent class)` : 기존에 정의되어 있던 클래스 ( `상위 클래스(super class)` )

-  `자식 클래스(child class)` : 부모 클래스의 모든 특성을 물려받아 새롭게 작성된 클래스 ( `하위 클래스(sub class)` )

	- 부모 클래스에 새로운 필드를 하나 추가하면, 자식 클래스에도 자동으로 해당 필드가 추가된 것처럼 동작합니다.

  

	- 자식 클래스에는 부모 클래스의 필드와 메소드만이 상속되며, 생성자와 초기화 블록은 상속되지 않습니다. 또한, 부모 클래스의 접근 제어가 `private`이나 `default`로 설정된 멤버는 자식 클래스에서 상속받지만 접근할 수는 없습니다.

  

- 자식 클래스의 선언

```
class 자식클래스이름 extend 부모클래스이름 {
	...
}
```

-  `Object` 클래스 : 자바에서 `Object` 클래스는 모든 클래스의 부모 클래스가 되는 클래스. 따라서 자바의 모든 클래스는 자동으로 `Object` 클래스의 모든 필드와 메소드를 상속받게 된다.

  

	- 즉, 자바의 모든 클래스는 별도로 `extends` 키워드를 사용하여 `Object` 클래스의 상속을 명시하지 않아도 `Object` 클래스의 모든 멤버를 자유롭게 사용할 수 있습니다.

  

	- 자바의 모든 객체에서 `toString()`이나 `clone()`과 같은 메소드를 바로 사용할 수 있는 이유가 해당 메소드들이 `Object` 클래스의 메소드이기 때문입니다.


---

<br>

>### super와 super( )

-  `super` : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수입니다.

	- 아래 예제에서 `int`형 변수 `num`은 자식 클래스인 `Child` 클래스에서도 선언되어 있습니다. 따라서 지역 변수와 `this` 참조 변수는 자식 클래스에서 대입된 값을 출력하며, `super` 참조 변수만이 부모 클래스에서 대입된 값을 출력하게 됩니다.

```
class Parent {
	int a = 10;
}

class Child extends Parent {
	int a = 20;
	
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		}
}

public class Inheritance03 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();
	}
}
```
```
20
20
10
```

  

-  `super()` : 부모 클래스의 생성자를 호출

	- 클래스의 생성자 첫 줄에는 항상 `this()` 혹은 `super()`가 있어야함 (object 제외)

	- 프로그래머가 작성하지 않았다면, 컴파일러가 자동으로 `super()` 호출. 만약 부모 클래스가 파라미터가 존재하지 않는 생성자를 포함하고 있지 않을 경우, 자식 클래스는 `super()`를 사용할 수 없음

  

---

<br>  

>### OverLoading/Overriding

-  `오버로딩(Overloading)` (확장) : 같은 이름의 메서드 여러 개를 가지면서 매개변수의 데이터타입 혹은 개수가 다르도록 사용하는 것

	- 같은 기능을 하는 메서드를 하나의 이름으로 사용할 수 있기 때문이며, 메서드의 이름을 절약할 수 있다.


-  `오버라이딩(Overriding)` (재정의) : 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용하는 것

	- 메서드의 이름이 같고, 매개변수가 같고, 반환형이 같은 경우에 상속받은 메서드를 덮어 쓴다 라고 생각할 수 있다.

  

```
class Parent {
	void display() {
		System.out.println("부모 클래스의 display() 메소드입니다.");
	}
}

class Child extends Parent {
	void display() {System.out.println("자식 클래스의 display() 메소드입니다.");} 		// Overriding
	void display(String str) { System.out.println(str); } 							// OverLoading
}
```

---

<br>

## 07. 인터페이스(interface)

>### 인터페이스의 개념

- 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미합니다.

- 인터페이스의 장점 : 인터페이스를 사용하면 다중 상속이 가능할 뿐만 아니라 다음과 같은 장점을 가질 수 있습니다.

	- 대규모 프로젝트 개발 시 일관되고 정형화된 개발을 위한 표준화가 가능합니다.
	
	- 클래스의 작성과 인터페이스의 구현을 동시에 진행할 수 있으므로, 개발 시간을 단축할 수 있습니다.
	
	- 클래스와 클래스 간의 관계를 인터페이스로 연결하면, 클래스마다 독립적인 프로그래밍이 가능합니다.

---

<br>

>### 인터페이스의 선언 및 구현

- 인터페이스의 선언 : 자바에서 인터페이스를 선언하는 방법은 클래스를 작성하는 방법과 같습니다. 인터페이스를 선언할 때에는 접근 제어자와 함께 `interface` 키워드를 사용하면 됩니다.

	- 단, 클래스와는 달리 인터페이스의 모든 필드는 `public static final`이어야 하며, 모든 메소드는 `public abstract`이어야 합니다. 이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있습니다.

  

```
접근제어자 interface 인터페이스이름 {
	public static final 타입 상수이름 = 값;
	...
	public abstract 메소드이름(매개변수목록);
	...
}
```

- 인터페이스의 구현 : 인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수는 없습니다. 따라서 인터페이스가 포함하고 있는 추상 메소드를 구현해 줄 클래스를 작성해야만 합니다.

- 인터페이스는 인터페이스로 부터만 상속을 받을 수 있으며, 여러 인터페이스를 상속 받을 수 있습니다.

```
class 클래스이름 implements 인터페이스이름 { ... }
```

- 상속과 구현을 동시에 수행하는 문법

```
class 클래스이름 extend 상위클래스이름 implements 인터페이스이름 { ... }
```

- 예제

```
interface Animal { 
	public abstract void cry(); 
}

class Cat implements Animal {
	public void cry() {
		System.out.println("냐옹냐옹!");
	}
}

class Dog implements Animal {
	public void cry() {
		System.out.println("멍멍!");
	}
}

public class test01 {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.cry();
		d.cry();
	}
}
```
```  
냐옹냐옹!
멍멍!
```

- 예제

```
interface Animal { public abstract void cry(); }
interface Pet { public abstract void name(); }

class Cat implements Animal, Pet { 			// Animal과 Pet이라는 두 개의 인터페이스를 동시에 구현

public void cry() {
	System.out.println("냐옹냐옹!");
}

public void name() {
	System.out.println("고양이");
	}
}

  

class Dog implements Animal, Pet { 			// Animal과 Pet이라는 두 개의 인터페이스를 동시에 구현
	public void cry() {
		System.out.println("멍멍!");
	}
	
	public void name() {
		System.out.println("강아지");
	}
}

public class test02 {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		c.name();
		d.cry();
		d.name();
	}
}
```
```
냐옹냐옹!
고양이
멍멍!
강아지
```