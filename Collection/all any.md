# all, any

```kotlin
  val under30 = { p : Person -> p.age < 30}
  // 모든 원소가 만족하는지 판단하려면 all 함수를 사용합니다.
   
  val people = listOf(Person("안드로이드", 25), Person("코틀린", 33))
  println(people.all(under30))
  // => false
  
  //하나라도 만족하는 원소가 있는지 판단하려면 any 함수를 사용합니다.
  println(people.any(under30))
  // => true
```
팁으로 !all과 !any를 사용할 순 있지만 <br />
다만 (!all = any), (!any = all) 와 같은 경우에는 앞에 ! 연산자를 눈치 채치 못하는 경우가 있기 떄문에 
**가독성을 높이기 위해 가급적이면 any와 all 앞에 !를 붙이지 않는 편이 낫습니다!**

