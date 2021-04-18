## Java Naming Convention

자바에서 클래스, 인터페이스, 메소드, 변수, 상수, 패키지 등의 이름을 지어줄 경우

따라야 하는 암묵적인 규칙을 Java Naming Convention(자바 명명 규칙, 자바 네이밍 규칙)이라고 한다.

___

**1. 클래스(Class), 인터페이스(Interface)**

명사여야하고 대문자로 시작해야 한다

EX : class Animal, Interface Person


 

**2. 메소드 (Method)**

메소드는 동사여야 하고 소문자로 시작한다.

두 단어를 붙일 경우에는,

붙이는 단어의 첫 문자를 대문자로 써야 한다.

이런 방식을 **카멜 케이스(CamelCase)방식**이라고도 한다.

EX : void methodTest

 


**3. 변수 (Variables)**

변수는 소문자로 시작하며,

임시변수(i, j, k, m, n, c, d, e)를 제외하면,

한 글자는 지양하는 것이 좋다.

EX : String name = "TEST";

int test = 10;


 

**4. 상수(Constant)**

상수는 모든 글자에 대문자를 사용하며

여러 단어를 연결시에는 _를 사용한다

EX) int MAX_VALUE;

 
 

**5. 패키지 (Package)**

패키지는 모두 소문자를 사용할 것을 권장한다

package a_package
