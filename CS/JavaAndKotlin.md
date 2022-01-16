# 자바의 특징
*객체지향 방법론을 사용하며 여러 운영체제에서 실행될 수 있는 언어
- 멀티 플랫폼
  - 크로스 플랫폼이라고도 불리는데 JVM(Java Virtual Machine)만 설치되어 있으면 어떤 운영체제에서도 애플리케이션을 작동시킬 수 있습니다.


- 메모리 관리
  - 자바는 포인터 개념이 없고 자동으로 메모리를 관리합니다.
  - Garbage Collector 가 사용하지 않는 자원을 자동으로 반환해줍니다.
  - 프로그래밍이 편해집니다.


- OOP(Object Oriented Programing)
  - 부품들을 조립해서 하나의 제품을 만드는 것과 같은 원리입니다.
  - 객체(Object)라는 단위로 나누고 객체들끼리 상호작용하는 방식입니다.


- 멀티 스레드
  - Thread 클래스와 Runnable 인터페이스를 이용하여 멀티 스레드를 구현합니다.


- 동적 로딩
  - 필요한 시점에 구현한 클래스를 로딩할 수 있습니다.
  
------------------

# 코틀린 특징
*개발자의 편의성, 간결하고 효율적인 코드 작성, 객체지향 ㅍ,ㅡ로그래밍과 함수형 프로그래밍의 장점을 절묘하게 조화시킨 언어*

- 코틀린은 jvm의 바이트Type Inference
  - 할당되는 리터럴 값을 알아서 추론해줍니다.
- OOP 와 FP (Functional Programing)
  - 객체지향 프로그래밍, 함수형 프로그래밍을 모두 지원합니다.
  - 코틀린에서 함수는 일급 객체입니다.
  - 고차 함수로 사용이 가능합니다.
- 모든 타입이 클래스 타입
  - 기본형 타입마저 클래스로 존재합니다. (Nullable 위해)
- Nullable
  - Null 할당이 가능한 타입을 선언할 수 있습니다.
  - NPE 예외를 컴파일 시점에서 미리 방지할 수 있습니다.

----------------
# 자바와 코틀린의 차이점
각 언어의 간단한 특징들만 살펴봤습니다.
자바 언어가 1990년대에 등장했고 코틀린 언어가 2010년도에 등장했으니 코틀린이 웬만한 좋은 특징들을 가지고 있기 때문에 간단하게 적었습니다.
코틀린의 좋은특징 으로 **가비지 컬텍터, 동적 로딩 등**

|  | Type system | Multi-Platform | OOP | FP | Type Inference | Nullable |
|--------------|--------------|--------------|--------------|--------------|--------------|--------------|--------------|

|| Type system | Multi-Platform | OOP | FP | Type Inference | Nullable |
|:------:|:------:|:------:|:------:|:------:|:------:|:------:|
|  자바(JAVA)    |  정적타입   |  O   |   O   |   X   |   X(9 이하)   |   X   |
|  코틀린(Kotlin)    |  정적타입   |  O   |   O   |   O   |   O   |   O   |

두 언어는 정적 타입으로 컴파일러가 타입 오류를 잡아줄 수 있습니다.


또한 두 언어는 멀티 플랫폼 개발을 할 수 있는 비슷한 장점을 가지고 있습니다

특히 두 언어로 안드로이드 개발이 가능합니다. 모두 객체지향 프로그래밍을 지원하며 class 키워드를 사용 가능하나 자바는
class가 기본 단위로 class 안에서 로직을 만들어야 합니다.

반면에 코틀린은 class가 선택사항이며 Top-Level 에서 변수, 함수의 선언과 구현이 가능합니다

코틀린은 타입 추론이 가능하나 자바(9 이하)는 타입 추론을 할 수 없습니다.

###### 마지막으로 중요한 차이점은 NPE 입니다. 자바는 null 을 참조하게 되면 예외를 발생시킵니다. 런타임 시에 흔히 발생할 수 있는 예외입니다.
###### 그러나 코틀린은 컴파일 시점에서 미리 방지할 수 있습니다. Null을 확인하는 연산자들이 존재하고 Null이 가능한 타입도 있습니다.

# 코드 차이 ( 안드로이드 기준)
## 1. 객체의 간결화
### Java
객체를 new로 초기화 한 후 객체를 사용한다. (각각의 데이터를 putExtra를 통해 전달한다.)
```java
   Intent intent = new Intent(this,JavaActivity.class); //객체 초기화 및 생성
    intent.putExtra("Java",1); 
    intent.putExtra("Kotlin",2);
```
### Kotlin
객체를 new로 초기화 하지 않아도 객체를 선언할 수 있다. apply ablock을 사용하여 전달할 데이터까지 묶어서 간결하게 선언할 수 있다. block 안에서는 아래와 같이 사용할 수 있으므로
 다록성과 코드가 깔끔해진다. 복잡할수록 더 효과가 있다.
 
```Kotlin
  val intent = Intent(this,MenuActivity::class.java).apply{ //apply block
        putExtra("java",1)
        putExtra("Kotlin",2)
    }
```

----------------

## 2. NULL의 안전성
### Java
@(Annotation)을 이용하여 구분할 수 있다.

@Nullable은 null이 가능하고, @nonNull은 null이 불가하다.
```java
    @Nullable String str1 = null;   //null 허용
    @NonNull String str2 = "notNULL"; // null 불허


    str1.substr(2); // error
    if(str1 != null)
        str1.substr(2); //ok
```
### Kotlin
Null의 안전성을 추구하기 위해 기본적으로 변수 값은 Null이 될수 없다.

만약 null을 사용하게 된다면 변수 뒤에 ?를 붙이면 된다. 하지만 java와 큰 차이는 지금부터다. 그 변수를 아래에서와 같이 str1.substr(2)로 부른다면 애초에 null값을
 호출한 것이기 때문에 빨간밑줄이 생긴다. 이는 사전에 에러를 막기 위해서다.
 
```Kotlin
    var str1:String? =null // ?를 붙이면 허용
    var str2:String = "notNULL" // default 값
    
    
    str1.substr(2)  // 빨간밑줄이 생김 --> 실행하기 전 오류 탐색 가능
```
----------------

## 3. 객체의 간결화
### Java
타입을 항상 명시해야 하고 final을 붙여 강제성을 추가할 수 있다.
```java
    String name = "SeungWon";// 가변
    final int age = 24;// 불변
    Student st = new Student(name); //new 객체 생성
```
### Kotlin
 타입추론을 통해 자동지정됨으로 타입을 명시하지 않아도 된다.

변수가 가변일 경우 var,변수가 불변일 경우 val을 사용하면 된다.
 
```Kotlin
    var name ="SeungWon" //가변
    val age = 24 //불변
    val st = Student(name) //new 없이 객체 생성)
    }
```
----------------

## 4. 접근 제한자
### Java
총 3가지 접근 제한자가 있다.( public, private, protected)
```java
    public int a=0; // 모두 접근 가능
    private String b="JAVA"; // 현재 객체에서만 접근 가능
    protected char c='j'; // 같은 패키지에 있는 객체 & 상속관계인 객체에서 접근 가능
    int num = 1024; // default 값 --> 같은 패키지에서만 접근 가능
```
### Kotlin
Java에서와 달리 같은 모듈내에서만 사용할 수 있는 internal이 있다. 나머지는 Java와 같다.
 
```Kotlin
    val a=0  //default 는 public
    protected val b=1
    private val c=2
    internal val d =3  // 같은 모듈 내에서만 가능
```
----------------

## 5. 생성자 & 클래스
### Java
생성자의 형태에 따라 별도로 생성해 주어야 한다. DTO(Data Transfer Object)를 사용하기 위해

getter,setter함수를 선언해야 한다.
```java
   public class Java{
        private int a;
        int b;
        public Java(int a, int b){
            this.a=a; this.b=b;
        }
        public Java(int a){
            this(a,0); // a 값만 인자로 받는 생성자
        }
        
       public int getA(){return a;} // getter 함수
       public void setA(int a){this.a=a;} // setter 함수
    }
```
### Kotlin
기본 생성자를 선언하지 않고 init으로 대체한다.

```Kotlin
   public class Kotlin(a:Int, b:Int){
        init{
            //기본 생성자          
        }
    }
```

var로 변수 선언하게 되면 DTO를 사용하기 위해 별도로 getter,setter를 선언하지 않아도 된다. 
```kotlin
    public class(val a:Int, val b:Int) //주 생성자 간결화
    constructor(a: Int) : this(a,0) // 다른 형태의 생성자
```
----------------










