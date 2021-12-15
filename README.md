<h1># 읽기 쉬운 코드가 클린코드이다</h1>
출처:https://www.samsungsds.com/kr/story/cleancode-0823.html

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
