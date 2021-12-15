<h1># 읽기 쉬운 코드가 클린코드이다</h1>


<br/>
<pre>
“I like my code to be elegant and efficient. The logic should be straightforward and make it hard
for bugs to hide,the dependencies minimal to ease maintenance,
error handling complete according to an articulated strategy, 
and performance close to optimal so as not to tempt people to make the code messy 
with unprincipled optimizations.Clean code does one thing well.”

                                                             - Bjarne Stroustrup, inventor of ‘C++

</pre>
 <h2>Clean Code의 주요원칙 </h2> 
 <ul>
  <li>Follow Standard Conventins | Coding 표준, 아키텍쳐 표준 및 설계 가이드를 준수하라.</li> 
  <li>Keep it Simple, Stupid(KISS) | 단순한 것이 효율적이며, 복잡함을 최소화하라</li> 
  <li>Boy Scout Rule | 캠핑장을 떠나기 전에 원래보다 깨끗하게 해야하나다.(참조되거나 수정되는 코드는 원래보다 clean하게 해야 한다.)</li> 
  <li>Root Cause Analysis : 항상 근본적인 원인을 찾아라. 그렇지 않으면 반복될 것이다.</li>
  <li>Do not Mutiple Languages in One Source File: 하나의 파일은 하나의 언어로 작성하라</li> 
 </ul>
 
|S|O|L|I|D|
|:----------:|:----------:|:----------:|:----------:|:----------:|
|Simpe<br/> Responsibility<br/> Principle(SRP)|Open/Closed <br/> Principle<br/>(OCP)|Liskov<br/>Substitution<br/>Principle (LSP)|Interfave<br/>Segregation<br/> Principle (ISP)|Dependency<br/>Inversion<br/>Principle (DIP)|
 |하나의 클래스는 하나의 책임만 가져야 한다.|클래스트는 확장에 대하여 열려 있어야 하고, 변경에 대해서는 닫혀 있어야 한다.|파생 클래스의 메소드 기반 클래스의 메서드를 대체하여 사용될 수 있어야 한다.|클라이언트가 사용하지 않는 메소드에 의존하지 않아야 한다.|추상화된 것은 구체적인 것에 의존하면 안된다(자주 변경되는 구체적인 것에 의존하지 말고 추상화된 것을 참조)|
 
# 클린코드 연습 페이지

> CleanCode의 습관을 만들기.




## 1. Name Convention

### 좋은 이름의 특징
<ol>
  <li> easy to Search 검색하기 쉽고</li>
  <li> easy to Mix 조합하기 쉽고</li>
  <li> easy to Agree 수긍하기 쉽고</li>
  <li> easy to Remember 기억하기 쉽고</li>
  <li> easy to type 입력하기 쉽고</li>
  
</ol>

> · 모든 변수나 함수, 클래스들은 CameCase 스타일. 유일한 다른점 하나는 클래스의 첫자가 대문자이다.
```java
  class UserService{
    private String firstName;
    
    public String getFirstName(){
      return firstName;
    }
 }
```
>상수는 전부 대문자에 언더스코어로 띄어쓰기를 하는게 좋다.
```java
final int MAX_AGE = 20;
```

>특수기호나 숫자를 쓰는 것을 피해라
```java
//This is a BAD practice //안좋은 예들
User user1 = new User();
User user2$ = new User();
```
>너무 긴 글자들 변수/메소드명에 쓰지 말아라. 가능하면 심플하게 하면서, 정보를 담아라
```java
//This is BAD practice // 안좋은 예들
public void saveUserIntoMongoDBDatabase(User user);

//This is much better //좀 더 나은 예들
public void saveUser(User user);
```
>함수 이름은 동사로 클래스나 속성의 이름은 명사로 지어라

## 2. 무엇을 의미하지 적어라 

>BAD Case
```java
  public boolean check(){
    if(a < max){
      return true;
    }else{
      return false;
    }
 }
```
>Better Case
```java
public boolean isAgeAcceptable(){
  if(userAge < magAge){
    return true;
  }else{
    return false;
 }
```
코드의 의미를 부여하기 위해 리팩토링을 공부해자

## 3. 변수와 메소드의 선언
<pre>
· 모든 클래스의 변수들은 클래스의 맨위 | 변수의 위치를 찾는 시간 감소
· 변수 한 번의 사용일 경우 로컬 변수사용이 유리
· 메소드 선언은 사용되는 순서대로 | 중요⬆ 클래스 위쪽, 중요⬇ 클래스 아랫쪽
</pre>

## 4. 작은 메소드(함수)
메소드의 길이에 대한 표준 패턴은 없다.<br/>
그냥 최대한 작게작게 만들어라.<br/>
가장 좋은 메소드는 5~ 10줄로 여겨진다.<br/>
15줄 코드여도 상관없으니 좋고 고퀄리티로 만들어라.<br/>

## 5. 코드의 최소화
한줄로 끝날 수 있다면 3줄의 코드로 풀어쓰지 말아라.<br/>
코드블럭을 추가하기 전에 최상의 접근법을 생각하고 적용할 필요가 있다.

```java
  boolean hasCreditCard(User user){
    if(user.hasCard){
      return true;
    }else{
      return false;
     }
    }
  }
```
> 단순화
```java
boolan hasCreditCard(User user){
  return user.hasCard;
}
```
## 6. 중복은 악이다
메소드는 가능하면 최대한 넓게 쓰여야 한다.<br>
예를 들면, 거의 같은 것을 구현한 두개의 함수가 있고, 단지 1줄의 코드만 다르다면, 같은 기능을 뽑아내서 하나로 만들고, 두개를 연결해서 다른 조건 체크를 만드는 것이 낫다.

## 7. 코멘트 작성

좋은 코드에는 주석이 필요없다. <br />
<h3> 코드에는 의미를 / 주석에는 의도를 적자</h3>

## 참조
개발자의 글쓰기 <br/>
https://medium.com/oril/10-tips-to-keep-your-code-more-clean-2fa9aafea1cf
https://www.samsungsds.com/kr/story/cleancode-0823.html <br/>
https://itdar.tistory.com/





