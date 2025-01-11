```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.filter { it > 5 }
    println(result) // Output: [6, 8, 10]

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val filteredMap = map.filterValues { it > 1 }
    println(filteredMap) // Output: {b=2, c=3}

    // Correct usage of filter with a list of custom objects
    data class Person(val name: String, val age: Int)
    val people = listOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35))
    val adults = people.filter { it.age > 18 } // Correct
    println(adults)
    val filteredPeople = people.filter { it.age > 18 }.map { it.name } // Correct
    println(filteredPeople)

    //Correct way to filter even numbers from a mutableList 
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = mutableList.filter { it % 2 == 0 }
    println(evenNumbers) // Output: [2,4]  
    val oddNumbers = mutableList.filter { it % 2 != 0 }
    println(oddNumbers) // Output: [1,3,5]
    //Or use a new list: 
    val newList = mutableListOf<Int>()
    for (value in mutableList) {
        if (value % 2 != 0) {
            newList.add(value)
        }
    }
    println(newList) // Output: [1,3,5]
}
```