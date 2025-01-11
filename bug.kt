```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.filter { it > 5 }
    println(result) // Output: [6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val filteredMap = map.filterValues { it > 1 }
    println(filteredMap) // Output: {b=2, c=3}

    // Incorrect usage of filter with a list of custom objects
    data class Person(val name: String, val age: Int)
    val people = listOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35))
    val adults = people.filter { it.age > 18 } // Correct
    println(adults) // Output: [Person(name=Alice, age=30), Person(name=Bob, age=25), Person(name=Charlie, age=35)]
    val filteredPeople = people.filter { it.age > 18 }.map { it.name } // Correct
    println(filteredPeople) // Output: [Alice, Bob, Charlie]

    //Example of potential error:  Using filter on a mutable list while modifying it in the lambda
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val filteredMutableList = mutableList.filter { value -> 
        if (value %2 == 0) {
            mutableList.remove(value) //Modifying the list while iterating over it 
            false //Removing even numbers
        }else {
            true
        }
    }
    println(filteredMutableList) // Output might vary or throw exception
}
```