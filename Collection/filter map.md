# Filter
<pre>
  fulter 함수는 컬랙션을 iteration 하면서 주어진 람다에 각 원소를 넘겨서 
  람다가 true를 반환하는 조건에 맞는) 원소만 필터링 하는 기능입니다.
  
  filter의 결과는, 입력 컬렉션의 원소 중에서
  **주어진 조건문에 만족하는 원소만으로 이루어진 새로운 컬렉션** 입니다.
 
</pre>

```kotlin
    var list  = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 }) //짝수만 필터링
    //==> [2, 4]
```
![image](https://user-images.githubusercontent.com/41848169/149785829-484041fd-4f7b-4d03-b572-e0524337321c.png)

# map
<pre>
  map 함수는 각 원소를 원하는 형태로 변환하는 기능을 하며, 변환한 결과를 모아서 새 컬렉션을 만듭니다.
  결과는 원본 리스트와 원소 갯수는 같지만, 각 원소는 주어진 람다(함수)에 따라 변환된 새로운 컬렉션 입니다.
</pre>

```kotlin
    var list  = listOf(1, 2, 3, 4)
    println(list.filter { it * it }) //제곱 만들기 (1x1, 2x2, 3x3, 4x4)
    //==> [1, 4, 9, 16]
```
![image](https://user-images.githubusercontent.com/41848169/149791108-df4c29b1-036c-4080-bd33-92ef7b7cdc2e.png)

```kotlin
/* filter '내부'에서 maxBy 이용 [비효율적 코드] */
people.filter { it.age == people.maxBy(Person::age)!!.age }

/* filter '외부'에서 maxBy 이용 [효율적 코드] */
val maxAge = people.maxBy(Person::age)!!.age
people.filter { it.age == maxAge }

```
