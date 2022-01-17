# sortedBy
<pre>
원본 리스트를 바꾸지 않고 소팅된 리스트를 리턴한다.

selector을 지정하면 소팅 기준을 정할 수 있다.
페어를 사용할 때도 하나의 기준을 두고 정렬하고 싶을 때 사용하면 된다.
pair에 접근할 땐 it.first it.second 이이런식으로 하면 된다.
</pre>

```kotlin
var sorted = planedit.sortedBy{it.first}
```

내림차순으로 정렬할 땐 **sortedByDescending()**을 사용하면 된다.

# sortedWith
<pre>
역시 원본 리지트를 바꾸지 않고 소팅된 리스트를 리턴한다.

sortedBy()와 다른점은 comparator을 지정해서 **다중 기준**을 둘 수 있다는 점이다.
첫번째 것으로 먼저 소팅한 후, 두번째 것도 소팅을 할 수 있다는 것이다.
</pre>

```kotlin
var sorted = planedit.sortedWith(compareBy({ it.first}, {it. second}))
```

![image](https://user-images.githubusercontent.com/41848169/149783319-f644806b-1dd9-43d6-b2f2-a92e9263ab3f.png)

내림차순으로 바꾸기 위해서는 **reversed()** 를 써주면 된다.
```kotlin
  var sorted = planedit.sortedWith(compareBy({ it.first }, { it.second })).reversed()
```
