# 주시하라! 좋구나
```kotlin
operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval,1)

class RepeatTimeInterval(val timeInterval: TimeInterval,val int:Int)

operator fun TimeInterval.times(int:Int) =
        RepeatTimeInterval(this,int)
operator fun MyDate.plus(t: RepeatTimeInterval) =
        addTimeIntervals(t.timeInterval,t.int )
```
-------------
```kotlin
class Invokable {
    var numberOfInvocations: Int = 0
        private set

    operator fun invoke(): Invokable {
        numberOfInvocations++
       return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()

```
----
# 컬렉션
```kotlin
fun Shop.getSetOfCustomers(): Set<Customer> =
        customers.toSet()

```
---
```kotlin
fun Shop.getCustomersSortedByOrders(): List<Customer> =
        customers.sortedByDescending {it.orders.size }

```
---
```kotlin
// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City> {
    return customers.map { it.city }.toSet()
}

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
        customers.filter { it.city == city }
```
